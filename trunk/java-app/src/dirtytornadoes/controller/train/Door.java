package dirtytornadoes.controller.train;

import dirtytornadoes.controller.train.events.TrainEvent;

public class Door extends TrainObject
{
	private String name;
	private boolean open;
	private boolean locked;
	private boolean blocked;
	
	public Door( String name )
	{
		this.name = name;
		
		open = false;
		locked = false;
		blocked = false;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String name )
	{
		this.name = name;
	}

	public boolean isOpen()
	{
		return open;
	}

	public void open()
	{
		open = true;
	}
	
	public void close()
	{
		open = false;
	}

	public boolean isLocked()
	{
		if (isOpen())
			return false;
		else
			return locked;
	}

	public void lock()
	{
		locked = true;
	}
	
	public void unLock()
	{
		locked = false;
	}

	public boolean isBlocked()
	{
		return blocked;
	}

	public void block()
	{
		blocked = true;
	}
	
	public void unBlock()
	{
		blocked = true;
	}

	@Override
	public void handleTrainEvent( TrainEvent ev )
	{
		// TODO Auto-generated method stub
		
	}
}
