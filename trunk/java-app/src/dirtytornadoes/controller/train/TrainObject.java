package dirtytornadoes.controller.train;

import dirtytornadoes.controller.Controller;
import dirtytornadoes.controller.train.events.TrainEventListener;

public abstract class TrainObject implements TrainEventListener
{
	public TrainObject()
	{
		Controller.getInstance().addTrainEventListener(this);
	}
	
	public abstract void updateController();

}
