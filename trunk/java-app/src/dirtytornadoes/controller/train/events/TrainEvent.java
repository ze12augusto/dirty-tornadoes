package dirtytornadoes.controller.train.events;

import java.util.EventObject;

public class TrainEvent extends EventObject
{
	private static final long serialVersionUID = 1L;
	
	private TrainEventType type;
	private String data;

	public TrainEvent( Object source, TrainEventType type, String data )
	{
		super(source);
		this.type = type;
		this.data = data;
	}
	
	public TrainEventType getType()
	{
		return type;
	}
	
	public String getData()
	{
		return data;
	}

}
