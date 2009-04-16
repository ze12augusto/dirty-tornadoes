package dirtytornadoes.controller.train;

import dirtytornadoes.controller.Controller;
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
			throw new IllegalTrainOperation("Cannot start train with brakes on");
		
		inMotion = true;
		if (Controller.DEBUG)
			System.out.println("Train engine started");
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
		
		setStopped();
	}
	
	public void brakesOn()
	{
		brakesOn = true;
		if (Controller.DEBUG)
			System.out.println("Train's brakes activated");
	}
	
	public void brakesOff()
	{
		brakesOn = false;
		if (Controller.DEBUG)
			System.out.println("Train's brakes deactivated");
	}

	public boolean brakesAreOn()
	{
		return brakesOn;
	}
	
	private void forceBrakesOn()
	{
		brakesOn = true;
		inMotion = false;
		if (Controller.DEBUG)
			System.out.println("Train's brakes FORCED on");
	}
	
	private void forceBrakesOff()
	{
		brakesOn = false;
		if (Controller.DEBUG)
			System.out.println("Train's brakes FORCED off");
	}
	
	private void setInMotion()
	{
		inMotion = true;
		brakesOn = false;
		if (Controller.DEBUG)
			System.out.println("Train FORCED in motion");
	}
	
	private void setStopped()
	{
		inMotion = false;
		brakesOn = true;
		if (Controller.DEBUG)
			System.out.println("Train FORCED stopped");
	}

	@Override
	public void handleTrainEvent( TrainEvent ev )
	{
		switch (ev.getType())
		{
			case TrainEvent.ENGINE_BRAKES_OFF:
				forceBrakesOff();
			break;
			
			case TrainEvent.ENGINE_BRAKES_ON:
				forceBrakesOn();
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
		// TODO Send engine information
		
		// send motion
		
		// send brakes
		
	}
}
