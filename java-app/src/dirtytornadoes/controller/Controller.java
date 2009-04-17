package dirtytornadoes.controller;

import java.util.ArrayList;
import java.util.StringTokenizer;

import dirtytornadoes.controller.io.SerialConnectionException;
import dirtytornadoes.controller.io.SerialDataEvent;
import dirtytornadoes.controller.io.SerialDataEventListener;
import dirtytornadoes.controller.io.SerialIO;
import dirtytornadoes.controller.train.Door;
import dirtytornadoes.controller.train.IllegalTrainOperation;
import dirtytornadoes.controller.train.Train;
import dirtytornadoes.controller.train.events.TrainEvent;
import dirtytornadoes.controller.train.events.TrainEventListener;
import dirtytornadoes.gui.TrainTestGUI;

public class Controller extends Thread implements SerialDataEventListener
{
	public static final char PIPE = 0x7c;
	public static final boolean DEBUG = true;
	
	private SerialIO io;
	
	private Train train;
	private volatile boolean running;
	private TrainTestGUI trainGUI;
	
	private ArrayList<TrainEventListener> listeners;
	
	protected Controller()
	{
		super("Train Controller");
		running = false;
		listeners = new ArrayList<TrainEventListener>();
		
		//io = new SerialIO();
		//io.connect(SerialIO.JEFF_PORT);
		//io.addEventListener(this);
	}
	
	public Train getTrain()
	{
		return train;
	}
	
	public void setTrain( Train train )
	{
		this.train = train;
	}
	
	public void createGUI(){
		trainGUI = new TrainTestGUI(train);
		 trainGUI.setVisible(true);
		 trainGUI.updateGUI(train);
	}
	
	public void setIO( SerialIO io )
	{
		this.io = io;
	}
	
	public SerialIO getIO()
	{
		return io;
	}
	
	public void sendData( char port, char value )
	{
		try
		{
			io.sendData(port, value);
		}
		catch (SerialConnectionException e)
		{
			System.err.println(e);
		}
	}
	
	public void addTrainEventListener( TrainEventListener object )
	{
		if (!listeners.contains(object))
			listeners.add(object);
	}

	@Override
	public void handleSerialDataEvent( SerialDataEvent ev )
	{
		char[] evData = ev.getData();
		
		char type = evData[0];
		
		char data = 0;
		if (evData.length > 1)
			data = evData[1];
		
		TrainEvent trainEv = new TrainEvent(this, type, data);
		
		for (TrainEventListener listener : listeners)
			listener.handleTrainEvent(trainEv);
	}
	
	public boolean isRunning()
	{
		return running;
	}
	
	public void startController()
	{
		start();
	}
	
	public void stopController()
	{
		running = false;
	}
	
	@Override
	public void run()
	{
		running = true;
		
		long lastRun = System.currentTimeMillis();
		
		while(running)
		{
			train.checkConditions();
			
			if ((lastRun + 250) <= System.currentTimeMillis())
			{
	//			train.updateController();
				lastRun = System.currentTimeMillis();
			}
				
			
			/*try
			{
				Thread.sleep(1);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}*/
		}
	}
	
	// SINGLETON CODE
	
	private static class SingletonHolder
	{
		private final static Controller INSTANCE = new Controller();
	}
	
	public static Controller getInstance()
	{
		return SingletonHolder.INSTANCE;
	}
	
	// MAIN METHOD
	
	public static void main( String[] args ) throws IllegalTrainOperation, InterruptedException, SerialConnectionException
	{
		// serial IO setup
	//	SerialIO s = new SerialIO();
	//	s.connect(SerialIO.JEFF_PORT);
		
		// controller setup
		Controller c = Controller.getInstance();
		c.setTrain(new Train());
		c.createGUI();
		
	//	s.addEventListener(c);
	//	c.setIO(s);
		
		c.startController();
		
		/*c.handleSerialDataEvent(new SerialDataEvent(c, TrainEvent.ACTION_START_MOVING));
		c.handleSerialDataEvent(new SerialDataEvent(c, TrainEvent.ACTION_EMERGENCY));
		c.handleSerialDataEvent(new SerialDataEvent(c, TrainEvent.ACTION_OPEN_DOORS));
		
		char[] doorData = { TrainEvent.DOOR_OPEN, Door.LEFT };
		c.handleSerialDataEvent(new SerialDataEvent(c, doorData));
		
		Thread.sleep(500);
		
		c.stopController();*/
	}
}
