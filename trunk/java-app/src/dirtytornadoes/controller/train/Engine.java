package dirtytornadoes.controller.train;

public class Engine
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

	public void setInMotion( boolean inMotion )
	{
		this.inMotion = inMotion;
	}

	public boolean brakesOn()
	{
		return brakesOn;
	}

	public void setBrakesOn( boolean brakesOn )
	{
		this.brakesOn = brakesOn;
	}
}
