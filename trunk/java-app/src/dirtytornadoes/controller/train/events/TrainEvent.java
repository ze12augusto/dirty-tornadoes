package dirtytornadoes.controller.train.events;

import java.util.EventObject;

public class TrainEvent extends EventObject
{
	private static final long serialVersionUID = 1L;
	
	// actions
	public static final char ACTION_OPEN_DOORS = 0x41;
	public static final char ACTION_CLOSE_DOORS = 0x42;
	public static final char ACTION_LOCK_DOORS = 0x43;
	public static final char ACTION_START_MOVING = 0x44;
	public static final char ACTION_STOP_MOVING = 0x45;
	public static final char ACTION_EMERGENCY = 0x46;
	public static final char ACTION_EMERGENCY_RESET = 0x47;
	
	// door
	public static final char DOOR_OPEN = 0x50;
	public static final char DOOR_CLOSE = 0x51;
	public static final char DOOR_UNLOCK = 0x52;
	public static final char DOOR_LOCK = 0x53;
	public static final char DOOR_UNBLOCK = 0x54;
	public static final char DOOR_BLOCK = 0x55;
	
	// engine
	public static final char ENGINE_BRAKES_ON = 0x60;
	public static final char ENGINE_BRAKES_OFF = 0x61;
	public static final char ENGINE_IN_MOTION = 0x62;
	public static final char ENGINE_STOPPED = 0x63;	
	
	private char type;
	private char data;

	public TrainEvent( Object source, char type, char data )
	{
		super(source);
		this.type = type;
		this.data = data;
	}
	
	public char getType()
	{
		return type;
	}
	
	public char getData()
	{
		return data;
	}

}
