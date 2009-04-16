package dirtytornadoes.controller.io;

import java.util.EventObject;

public class SerialDataEvent extends EventObject
{
	private static final long serialVersionUID = 1L;
	
	private char[] data;
	
	public SerialDataEvent( Object source, char data )
	{
		super(source);
		char[] newData = { data };
		this.data = newData;
	}
	
	public SerialDataEvent( Object source, char[] data )
	{
		super(source);
		this.data = data;
	}
	
	public char[] getData()
	{
		return data;
	}
}
