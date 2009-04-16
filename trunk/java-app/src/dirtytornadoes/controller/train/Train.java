package dirtytornadoes.controller.train;

import java.util.HashMap;

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
					engine.stop();
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
		{
			if (d.isLocked())
				d.unLock();
			
			d.open();
		}
	}
	
	public void closeDoors() throws IllegalTrainOperation
	{
		for(Door d : doors.values())
		{
			if (d.isOpen())
			{
				if (d.isBlocked())
					throw new IllegalTrainOperation("Cannot close doors, "+d.getName()+" is blocked");
				else
					d.close();
			}
		}
	}
	
	public void lockDoors() throws IllegalTrainOperation
	{
		// make sure all doors are closed
		closeDoors();
		
		for(Door d : doors.values())
		{
			if (!d.isLocked())
				d.lock();
			
			if (!d.isLocked())
				throw new IllegalTrainOperation("Could not lock door "+d.getName());
		}
	}
	
	public void startMoving() throws IllegalTrainOperation
	{
		if (engine.isInMotion())
			return;
		
		try
		{
			lockDoors();
		}
		catch (IllegalTrainOperation e)
		{
			throw new IllegalTrainOperation("Cannot move until all doors are closed and locked", e);
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

	@Override
	public void updateController()
	{
		// TODO Auto-generated method stub
		
	}
}
