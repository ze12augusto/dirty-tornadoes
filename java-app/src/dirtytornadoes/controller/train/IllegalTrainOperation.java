package dirtytornadoes.controller.train;

public class IllegalTrainOperation extends Exception
{
	private static final long serialVersionUID = 1L;
	
	private IllegalTrainOperation parent;

	public IllegalTrainOperation()
	{
		parent = null;
	}

	public IllegalTrainOperation( String message )
	{
		this(message, null);
	}
	
	public IllegalTrainOperation( String message, IllegalTrainOperation parent )
	{
		super(message);
		this.parent = parent;
	}
	
	public boolean hasParent()
	{
		return parent != null;
	}
	
	public IllegalTrainOperation getParent()
	{
		return parent;
	}

}
