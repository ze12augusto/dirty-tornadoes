package dirtytornadoes.controller.train.events;

import java.util.EventObject;

public class TrainEvent extends EventObject
{
	private static final long serialVersionUID = 1L;
	
	// actions
	public static final int ACTION_OPEN_DOORS = 00;
	public static final int ACTION_CLOSE_DOORS = 01;
	public static final int ACTION_LOCK_DOORS = 02;
	public static final int ACTION_START_MOVING = 04;
	public static final int ACTION_STOP_MOVING = 05;
	public static final int ACTION_EMERGENCY = 06;
	public static final int ACTION_EMERGENCY_RESET = 07;
	
	// door
	public static final int DOOR_OPEN = 10;
	public static final int DOOR_BLOCK = 11;
	public static final int DOOR_CLOSE = 12;
	public static final int DOOR_LOCK = 13;
	
	// engine
	public static final int ENGINE_BRAKES_ON = 20;
	public static final int ENGINE_BRAKES_OFF = 21;
	public static final int ENGINE_IN_MOTION = 22;
	public static final int ENGINE_STOPPED = 23;	
	
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
