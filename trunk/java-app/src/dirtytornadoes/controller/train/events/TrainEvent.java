package dirtytornadoes.controller.train.events;

import java.util.EventObject;

public class TrainEvent extends EventObject
{
	private static final long serialVersionUID = 1L;
	
	// door
	public static final int DOOR_OPEN = 00;
	public static final int DOOR_BLOCKED = 01;
	public static final int DOOR_CLOSE = 02;
	
	// engine
	public static final int ENGINE_BRAKES_ON = 10;
	public static final int ENGINE_BRAKES_OFF = 11;
	public static final int ENGINE_IN_MOTION = 12;
	public static final int ENGINE_STOPPED = 13;
	
	// train
	public static final int TRAIN_EMERGENCY = 21;
	public static final int TRAIN_EMERGENCY_RESET = 22;
	
	private int type;
	private String data;

	public TrainEvent( Object source, int type, String data )
	{
		super(source);
		this.type = type;
		this.data = data;
	}
	
	public int getType()
	{
		return type;
	}
	
	public String getData()
	{
		return data;
	}

}
