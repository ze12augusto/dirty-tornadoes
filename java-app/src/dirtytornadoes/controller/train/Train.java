package dirtytornadoes.controller.train;

import java.util.HashMap;

import dirtytornadoes.controller.IllegalTrainOperation;

public class Train
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
		doors.put("left", new Door());
		doors.put("right", new Door());
	}
	
	public void checkConditions()
	{
		
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
	
	public void startMoving()
	{
		
	}
	
	public boolean isEmergency()
	{
		return emergency;
	}
	
	public void activeEmergency()
	{
		emergency = true;
	}
	
	public void resetEmergency()
	{
		emergency = false;
	}
}
