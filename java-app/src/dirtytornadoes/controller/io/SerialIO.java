package dirtytornadoes.controller.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TooManyListenersException;

import javax.comm.CommPortIdentifier;
import javax.comm.CommPortOwnershipListener;
import javax.comm.NoSuchPortException;
import javax.comm.PortInUseException;
import javax.comm.SerialPort;
import javax.comm.SerialPortEvent;
import javax.comm.SerialPortEventListener;
import javax.comm.UnsupportedCommOperationException;

import dirtytornadoes.controller.train.events.TrainEventListener;


public class SerialIO implements SerialPortEventListener, CommPortOwnershipListener
{
	// known ports
	public static final String JEFF_PORT = "/dev/tts/0";

	public static final String BREAK = "@@BREAK@@";

	// serial port stuff
	private CommPortIdentifier portId;
	private SerialPort serialPort;
	private boolean connected;

	// input output
	private InputStream input;
	private OutputStream output;
	private LinkedList<String> data;
	
	// listeners
	private ArrayList<TrainEventListener> listeners;

	protected SerialIO()
	{
		connected = false;
		data = new LinkedList<String>();
	}
	
	public void addEventListener( TrainEventListener object )
	{
		if (!listeners.contains(object))
			listeners.add(object);
	}

	public void connect( String portName ) throws SerialConnectionException
	{
		try
		{
			portId = CommPortIdentifier.getPortIdentifier(portName);
			System.out.println("SerialIO :: Found port: " + portName);
		}
		catch (NoSuchPortException e)
		{
			System.err.println("SerialIO :: Could not find port: " + portName);
			throw new SerialConnectionException(e.getMessage());
		}

		try
		{
			serialPort = (SerialPort) portId.open("SimpleWrite", 2000);
		}
		catch (PortInUseException e)
		{
			System.err.println("SerialIO :: Port " + portName + " is in use");
			throw new SerialConnectionException(e.getMessage());
		}

		try
		{
			// TODO: Confirm serial port params
			serialPort.setSerialPortParams(9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
		}
		catch (UnsupportedCommOperationException e)
		{
			System.err.println("SerialIO :: Could not set serial port params for port " + portName);

			serialPort.close();
			throw new SerialConnectionException(e.getMessage());
		}

		try
		{
			output = serialPort.getOutputStream();
			input = serialPort.getInputStream();
		}
		catch (IOException e)
		{
			System.err.println("SerialIO :: Could not create outputStream for port " + portName);

			serialPort.close();
			throw new SerialConnectionException("Error opening i/o streams");
		}

		// Add this object as an event listener for the serial port.
		try
		{
			serialPort.addEventListener(this);
		}
		catch (TooManyListenersException e)
		{
			System.err.println("SerialIO :: Too many listeners for port " + portName);

			serialPort.close();
			throw new SerialConnectionException("Too many listeners added");
		}

		try
		{
			serialPort.notifyOnDataAvailable(true);
			serialPort.notifyOnBreakInterrupt(true);
			portId.addPortOwnershipListener(this);

			// serialPort.notifyOnOutputEmpty(true);
		}
		catch (Exception e)
		{
			System.err.println("SerialIO :: Error setting event notification");
			throw new SerialConnectionException(e.getMessage());
		}

		System.out.println("SerialIO :: Successfully connected to " + portName);
		connected = true;
	}

	public void disconnect()
	{
		if (!connected)
			return;

		if (serialPort != null)
		{
			try
			{
				output.close();
				input.close();
			}
			catch (IOException e)
			{
				System.err.println("SerialIO :: Could not close I/O streams");
			}

			serialPort.close();
			portId.removePortOwnershipListener(this);
		}

		connected = false;
	}

	public boolean isConnected()
	{
		return connected;
	}

	public String getPortName()
	{
		return portId.getName();
	}

	/**
	 * Send a one second break signal.
	 */
	public void sendBreak()
	{
		serialPort.sendBreak(1000);
	}

	public void sendData( String data ) throws SerialConnectionException
	{
		if (!connected)
		{
			System.err.println("SerialIO :: Could not send data to an unopened port");
			throw new SerialConnectionException("Can not send data to unopened port");
		}

		try
		{
			output.write(data.getBytes());
		}
		catch (IOException e)
		{
			System.err.println("SerialIO :: Could not send data");
			throw new SerialConnectionException(e.getMessage());
		}
	}
	
	public boolean hasMoreData()
	{
		return !data.isEmpty();
	}
	
	public String readData()
	{
		if (hasMoreData())
			return data.pop();
		else
			return null;
	}

	@Override
	public void serialEvent( SerialPortEvent ev )
	{
		StringBuffer inputBuffer = new StringBuffer();
		int newData = 0;

		switch (ev.getEventType())
		{
			case SerialPortEvent.DATA_AVAILABLE:
				while (newData != -1)
				{
					try
					{
						newData = input.read();

						if (newData == -1)
							break;

						if ((char) newData == '\r')
						{
							// at new line, add current buffer to data and start a new one
							data.add(inputBuffer.toString());
							inputBuffer = new StringBuffer();
							//inputBuffer.append('\n');
						}
						else
						{
							inputBuffer.append((char) newData);
						}
					}
					catch (IOException ex)
					{
						System.err.println("SerialIO :: IOException");
						System.err.println(ex);
						return;
					}
				}

				data.add(inputBuffer.toString());
			break;

			case SerialPortEvent.BI:
				data.add(BREAK);
			break;

			case SerialPortEvent.OE:
			case SerialPortEvent.FE:
			case SerialPortEvent.PE:
			case SerialPortEvent.CD:
			case SerialPortEvent.CTS:
			case SerialPortEvent.DSR:
			case SerialPortEvent.RI:
			case SerialPortEvent.OUTPUT_BUFFER_EMPTY:
				// do nothing
			break;
		}
	}

	@Override
	public void ownershipChange( int type )
	{
		if (type == CommPortOwnershipListener.PORT_OWNERSHIP_REQUESTED)
		{
			System.out.println("SerialIO :: Someone is requesting port ownership...");
		}
	}
	
	// SINGLETON CODE
	
	private static class SingletonHolder
	{
		private final static SerialIO INSTANCE = new SerialIO();
	}
	
	public static SerialIO getInstance()
	{
		return SingletonHolder.INSTANCE;
	}
}
