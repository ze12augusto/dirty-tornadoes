package dirtytornadoes.controller;

import java.util.ArrayList;
import java.util.StringTokenizer;

import dirtytornadoes.controller.io.SerialDataEvent;
import dirtytornadoes.controller.io.SerialDataEventListener;
import dirtytornadoes.controller.io.SerialIO;
import dirtytornadoes.controller.train.Door;
import dirtytornadoes.controller.train.IllegalTrainOperation;
import dirtytornadoes.controller.train.Train;
import dirtytornadoes.controller.train.events.TrainEvent;
import dirtytornadoes.controller.train.events.TrainEventListener;

public class Controller extends Thread implements SerialDataEventListener
{
	public static final String PIPE = "|";
	public static final boolean DEBUG = true;
	
	private SerialIO io;
	
	private Train train;
	private volatile boolean running;
	
	private ArrayList<TrainEventListener> listeners;
	
	protected Controller()
	{
		super("Train Controller");
		running = false;
		listeners = new ArrayList<TrainEventListener>();
		
		io = new SerialIO();
		//io.connect(SerialIO.JEFF_PORT);
		io.addEventListener(this);
	}
	
	public Train getTrain()
	{
		return train;
	}
	
	public void setTrain( Train train )
	{
		this.train = train;
	}
	
	public SerialIO getIO()
	{
		return io;
	}
	
	public void addTrainEventListener( TrainEventListener object )
	{
		if (!listeners.contains(object))
			listeners.add(object);
	}

	@Override
	public void handleSerialDataEvent( SerialDataEvent ev )
	{
		StringTokenizer st = new StringTokenizer(ev.getData(), PIPE);
		
		int type = Integer.parseInt(st.nextToken());
		
		String data = null;
		if (st.hasMoreTokens())
			data = st.nextToken();
		
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
		
		while(running)
		{
			train.checkConditions();
			train.updateController();
			
			try
			{
				Thread.sleep(250);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
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
	
	public static void main( String[] args ) throws IllegalTrainOperation
	{
		// setup
		Controller c = Controller.getInstance();
		c.setTrain(new Train());
		c.start();
		
		// get to work
		c.handleSerialDataEvent(new SerialDataEvent(c, TrainEvent.ACTION_START_MOVING+""));
		c.handleSerialDataEvent(new SerialDataEvent(c, TrainEvent.ACTION_EMERGENCY+""));
		c.handleSerialDataEvent(new SerialDataEvent(c, TrainEvent.ACTION_OPEN_DOORS+""));
		c.handleSerialDataEvent(new SerialDataEvent(c, TrainEvent.DOOR_OPEN+PIPE+Door.LEFT));
	}
}
