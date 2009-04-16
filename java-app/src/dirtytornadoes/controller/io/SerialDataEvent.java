package dirtytornadoes.controller.io;

import java.util.EventObject;

public class SerialDataEvent extends EventObject
{
	private static final long serialVersionUID = 1L;
	
	private String data;
	
	public SerialDataEvent( Object source, String data )
	{
		super(source);
		this.data = data;
	}
	
	public String getData()
	{
		return data;
	}
}
