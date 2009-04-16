package dirtytornadoes.controller;

import java.util.ArrayList;
import java.util.StringTokenizer;

import dirtytornadoes.controller.io.SerialDataEvent;
import dirtytornadoes.controller.io.SerialDataEventListener;
import dirtytornadoes.controller.io.SerialIO;
import dirtytornadoes.controller.train.Train;
import dirtytornadoes.controller.train.events.TrainEvent;
import dirtytornadoes.controller.train.events.TrainEventListener;

public class Controller extends Thread implements SerialDataEventListener
{
	public static final String PIPE = "|";
	
	private Train train;
	private volatile boolean running;
	
	private ArrayList<TrainEventListener> listeners;
	
	protected Controller()
	{
		super("Train Controller");
		train = new Train();
		running = false;
		
		SerialIO.getInstance().addEventListener(this);
		listeners = new ArrayList<TrainEventListener>();
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
		String data = st.nextToken();
		
		TrainEvent trainEv = new TrainEvent(this, type, data);
		
		for (TrainEventListener listener : listeners)
			listener.handleTrainEvent(trainEv);
	}
	
	public boolean isRunning()
	{
		return running;
	}
	
	@Override
	public void run()
	{
		running = true;
		
		while(running)
		{
			
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
}
