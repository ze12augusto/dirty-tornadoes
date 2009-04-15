package dirtytornadoes.controller.train;

import dirtytornadoes.controller.io.SerialIO;
import dirtytornadoes.controller.train.events.TrainEventListener;

public abstract class TrainObject implements TrainEventListener
{
	public TrainObject()
	{
		SerialIO.getInstance().addEventListener(this);
	}
}
