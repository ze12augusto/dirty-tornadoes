package dirtytornadoes.controller.train;

import dirtytornadoes.controller.Controller;
import dirtytornadoes.controller.train.events.TrainEvent;

public class Door extends TrainObject
{
	public static final char LEFT = 0x31;
	public static final char RIGHT = 0x32;
	
	private char id;
	private String name;
	
	private boolean open;
	private boolean locked;
	private boolean blocked;
	
	public Door( char id, String name )
	{
		this.id = id;
		this.name = name;
		
		open = false;
		locked = false;
		blocked = false;
	}
	
	public char getID()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}

	public boolean isOpen()
	{
		return open;
	}

	public void open() throws IllegalTrainOperation
	{
		if (isLocked())
			throw new IllegalTrainOperation("Cannot open "+name+" door when locked");
		
		open = true;
		if (Controller.DEBUG)
			System.out.println(name+" door opened");
	}
	
	public void close() throws IllegalTrainOperation
	{
		if (isBlocked())
			throw new IllegalTrainOperation("Cannot close "+name+" door when blocked");
		
		open = false;
		if (Controller.DEBUG)
			System.out.println(name+" door closed");
	}

	public boolean isLocked()
	{
		return locked;
	}

	public void lock() throws IllegalTrainOperation
	{
		if (isOpen())
			throw new IllegalTrainOperation("Cannot lock "+name+" door when open");
			
		locked = true;
		if (Controller.DEBUG)
			System.out.println(name+" door locked");
	}
	
	public void unLock()
	{
		locked = false;
		if (Controller.DEBUG)
			System.out.println(name+" door unlocked");
	}

	public boolean isBlocked()
	{
		return blocked;
	}
	
	private void forceBlock()
	{
		forceOpen();
		blocked = true;
		if (Controller.DEBUG)
			System.out.println(name+" door FORCED blocked");
	}
	
	private void forceUnBlock()
	{
		blocked = false;
		if (Controller.DEBUG)
			System.out.println(name+" door FORCED unblocked");
	}
	
	private void forceClose()
	{
		open = false;
		blocked = false;
		if (Controller.DEBUG)
			System.out.println(name+" door FORCED closed");
	}
	
	private void forceOpen()
	{
		open = true;
		locked = false;
		if (Controller.DEBUG)
			System.out.println(name+" door FORCED open");
	}
	
	private void forceLock()
	{
		forceClose();
		locked = true;
		if (Controller.DEBUG)
			System.out.println(name+" door FORCED locked");
	}
	
	private void forceUnLock()
	{
		locked = false;
		if (Controller.DEBUG)
			System.out.println(name+" door FORCED unlocked");
	}

	@Override
	public void handleTrainEvent( TrainEvent ev )
	{
		if (ev.getData() != id)
			return;
		
		switch (ev.getType())
		{
			case TrainEvent.DOOR_BLOCK:
				forceBlock();
			break;
			
			case TrainEvent.DOOR_UNBLOCK:
				forceUnBlock();
			break;
			
			case TrainEvent.DOOR_CLOSE:
				forceClose();
			break;
			
			case TrainEvent.DOOR_OPEN:
				forceOpen();
			break;
			
			case TrainEvent.DOOR_LOCK:
				forceLock();
			break;
			
			case TrainEvent.DOOR_UNLOCK:
				forceUnLock();
			break;
		}
	}

	@Override
	public void updateController()
	{
		// TODO Send door information
		
	}
}
