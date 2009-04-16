package dirtytornadoes.controller.train;

import dirtytornadoes.controller.train.events.TrainEvent;

public class Engine extends TrainObject
{
	private boolean inMotion;
	private boolean brakesOn;
	
	public Engine()
	{
		inMotion = false;
		brakesOn = true;
	}

	public boolean isInMotion()
	{
		return inMotion;
	}
	
	public void start() throws IllegalTrainOperation
	{
		if (brakesOn)
			throw new IllegalTrainOperation("Cannot move train with brakes on");
		
		inMotion = true;
	}
	
	public void stop()
	{
		brakesOn = true;
		inMotion = false;
	}

	public boolean isBrakesOn()
	{
		return brakesOn;
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
