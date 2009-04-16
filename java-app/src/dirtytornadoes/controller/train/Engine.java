package dirtytornadoes.controller.train;

import dirtytornadoes.controller.io.SerialIO;
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
	
	public void setInMotion()
	{
		inMotion = true;
		brakesOn = false;
	}
	
	public void setStopped()
	{
		inMotion = false;
	}
	
	public void start() throws IllegalTrainOperation
	{
		if (brakesOn)
			throw new IllegalTrainOperation("Cannot start train with brakes on");
		
		inMotion = true;
	}
	
	public void stop()
	{
		brakesOn();
		
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{}
		
		inMotion = false;
	}

	public boolean brakesAreOn()
	{
		return brakesOn;
	}
	
	public void brakesOn()
	{
		brakesOn = true;
	}
	
	public void brakesOff()
	{
		brakesOn = false;
	}

	@Override
	public void handleTrainEvent( TrainEvent ev )
	{
		switch (ev.getType())
		{
			case TrainEvent.ENGINE_BRAKES_OFF:
				brakesOff();
			break;
			
			case TrainEvent.ENGINE_BRAKES_ON:
				brakesOn();
			break;
			
			case TrainEvent.ENGINE_IN_MOTION:
				setInMotion();
			break;
			
			case TrainEvent.ENGINE_STOPPED:
				setStopped();
			break;
		}
		
	}

	@Override
	public void updateController()
	{
		// TODO send engine information
		SerialIO s = SerialIO.getInstance();
		
		// send motion
		
		// send brakes
		
	}
}
