package dirtytornadoes.controller.train;

public class Door
{
	private boolean open;
	private boolean locked;
	private boolean blocked;
	
	public Door()
	{
		open = false;
		locked = false;
		blocked = false;
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
}
