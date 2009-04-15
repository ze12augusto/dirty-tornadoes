package dirtytornadoes.controller.train;

import java.util.HashMap;

import dirtytornadoes.controller.IllegalTrainOperation;
import dirtytornadoes.controller.train.events.TrainEvent;

public class Train extends TrainObject
{
	private Engine engine;
	
	private HashMap<String, Door> doors;
	
	private boolean emergency;
	
	public Train()
	{
		engine = new Engine();
		doors = new HashMap<String, Door>();
		emergency = false;
		
		setupDoors();
	}
	
	private void setupDoors()
	{
		String[] doorNames = { "left", "right" };
		
		for (String name : doorNames)
			doors.put(name, new Door(name));
	}
	
	public void checkConditions()
	{		
		// check for open AND unlocked doors
		if (engine.isInMotion())
		{
			for(Door d : doors.values())
			{
				if (!d.isLocked())
				{
					engine.brakesOn();
				}
			}
		}
		
		// check for emergency
		if (isEmergency())
		{
			
		}
	}
	
	public void openDoors() throws IllegalTrainOperation
	{
		if (engine.isInMotion())
			throw new IllegalTrainOperation("Cannot open doors while train in motion");
		
		for (Door d : doors.values())
			d.open();
	}
	
	public void closeDoors()
	{
		
	}
	
	public void startMoving() throws IllegalTrainOperation
	{
		if (engine.isInMotion())
			return;
		
		for (Door d : doors.values())
		{
			if (!d.isLocked())
			{
				// try to lock doors
				if (d.isOpen() && !d.isBlocked())
				{
					d.close();
					d.lock();
				}
				else
				{
					throw new IllegalTrainOperation("Cannot move until all doors locked");
				}
			}
		}
		
		engine.start();
	}
	
	public boolean isEmergency()
	{
		return emergency;
	}
	
	public void activateEmergency()
	{
		emergency = true;
	}
	
	public void resetEmergency()
	{
		emergency = false;
	}

	@Override
	public void handleTrainEvent( TrainEvent ev )
	{
		// TODO Auto-generated method stub
		
	}
}
