package dirtytornadoes.controller.train;

import dirtytornadoes.controller.Controller;
import dirtytornadoes.controller.train.events.TrainEventListener;

public abstract class TrainObject implements TrainEventListener
{
	private Controller controller;
	
	public TrainObject()
	{
		controller = Controller.getInstance();
		controller.addTrainEventListener(this);
	}
	
	protected Controller getController()
	{
		return controller;
	}
	
	public abstract void updateController();

}
