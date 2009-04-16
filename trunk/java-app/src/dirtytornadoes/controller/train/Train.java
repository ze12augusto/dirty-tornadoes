package dirtytornadoes.controller.train;

import java.util.ArrayList;

import dirtytornadoes.controller.Controller;
import dirtytornadoes.controller.train.events.TrainEvent;

public class Train extends TrainObject
{
	private Engine engine;
	private ArrayList<Door> doors;
	
	private boolean emergency;
	
	public Train()
	{
		engine = new Engine();
		doors = new ArrayList<Door>();
		emergency = false;
		
		setupDoors();
	}
	
	private void setupDoors()
	{
		String[] doorNames = { Door.LEFT, Door.RIGHT };
		
		for (String name : doorNames)
			doors.add(new Door(name));
	}
	
	public void checkConditions()
	{		
		// check for unlocked (OR open) doors
		if (engine.isInMotion())
		{
			for(Door d : doors)
				if (!d.isLocked())
				{
					if (Controller.DEBUG)
						System.err.println("Found "+d.getName()+" door unlocked, stopping engine");
					
					engine.stop();
				}
		}
	}
	
	public void openDoors() throws IllegalTrainOperation
	{
		if (engine.isInMotion())
			throw new IllegalTrainOperation("Cannot open doors while train in motion");
		
		for (Door d : doors)
		{
			if (d.isLocked())
				d.unLock();
			
			d.open();
		}
	}
	
	public void closeDoors() throws IllegalTrainOperation
	{
		for(Door d : doors)
		{
			if (d.isOpen())
				d.close();
		}
	}
	
	public void lockDoors() throws IllegalTrainOperation
	{
		// make sure all doors are closed
		closeDoors();
		
		for(Door d : doors)
		{
			if (!d.isLocked())
				d.lock();			
		}
	}
	
	public void startMoving() throws IllegalTrainOperation
	{
		if (engine.isInMotion())
			return;
		
		if (hasEmergency())
			throw new IllegalTrainOperation("Cannot start moving until emergency has been reset");
		
		try
		{
			lockDoors();
		}
		catch (IllegalTrainOperation e)
		{
			throw new IllegalTrainOperation("Cannot move until all doors are closed and locked", e);
		}
		
		brakesOff();
		engine.start();
	}
	
	public void stopMoving()
	{
		engine.stop();
	}
	
	public void brakesOn()
	{
		engine.brakesOn();
	}
	
	public void brakesOff() throws IllegalTrainOperation
	{
		if (hasEmergency())
			throw new IllegalTrainOperation("Cannot take brakes off when emergency presetn");
		
		engine.brakesOff();
	}
	
	public boolean hasEmergency()
	{
		return emergency;
	}
	
	public void activateEmergency()
	{
		emergency = true;
		if (Controller.DEBUG)
			System.out.println("Emergency activated");
	}
	
	public void resetEmergency() throws IllegalTrainOperation
	{
		if (engine.isInMotion())
			throw new IllegalTrainOperation("Cannot reset emergency while train in motion");
		
		emergency = false;
		if (Controller.DEBUG)
			System.out.println("Emergency deactivated");
	}

	@Override
	public void handleTrainEvent( TrainEvent ev )
	{
		try
		{
			switch (ev.getType())
			{
				case TrainEvent.ACTION_CLOSE_DOORS:
					closeDoors();
				break;
				
				case TrainEvent.ACTION_LOCK_DOORS:
					lockDoors();
				break;
				
				case TrainEvent.ACTION_OPEN_DOORS:
					openDoors();
				break;
				
				case TrainEvent.ACTION_START_MOVING:
					startMoving();
				break;
				
				case TrainEvent.ACTION_STOP_MOVING:
					stopMoving();
				break;
				
				case TrainEvent.ACTION_EMERGENCY:
					activateEmergency();
				break;
				
				case TrainEvent.ACTION_EMERGENCY_RESET:
					resetEmergency();
				break;
			}
		}
		catch (IllegalTrainOperation e)
		{
			System.err.println("Exception: "+e.getMessage());
			
			if (e.hasParent())
				System.err.println("Parent Exception: "+e.getParent().getMessage());
		}
		
	}

	@Override
	public void updateController()
	{
		engine.updateController();
		
		for(Door d : doors)
			d.updateController();
		
		// TODO Send emergency info
	}
}
