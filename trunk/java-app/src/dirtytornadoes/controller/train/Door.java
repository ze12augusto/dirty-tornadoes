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

	public boolean open()
	{
		if (!isLocked())
			open = true;
		
		return open;
	}
	
	public boolean close()
	{
		if (!isBlocked())
			open = false;
		
		return !open;
	}

	public boolean isLocked()
	{
		return locked;
	}

	public boolean lock()
	{
		if (!isOpen())
			locked = true;
		
		return locked;
	}
	
	public void unLock()
	{
		locked = false;
	}

	public boolean isBlocked()
	{
		return blocked;
	}

	public boolean block()
	{
		if (isOpen())
			blocked = true;
		
		return blocked;
	}
	
	public void unBlock()
	{
		blocked = true;
	}

	@Override
	public void handleTrainEvent( TrainEvent ev )
	{
		if (!ev.getData().equals(name))
			return;
		
		switch (ev.getType())
		{
			case TrainEvent.DOOR_BLOCK:
				block();
			break;
			
			case TrainEvent.DOOR_CLOSE:
				close();
			break;
			
			case TrainEvent.DOOR_OPEN:
				open();
			break;

			default:
			break;
		}
	}

	@Override
	public void updateController()
	{
		// TODO Send door information
		
	}
}
