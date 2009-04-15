package dirtytornadoes.controller;

public class IllegalTrainOperation extends Exception
{
	private static final long serialVersionUID = 1L;

	public IllegalTrainOperation()
	{
	}

	public IllegalTrainOperation( String message )
	{
		super(message);
	}

}
