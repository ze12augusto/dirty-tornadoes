package dirtytornadoes.gui;

import dirtytornadoes.controller.train.Train;

public class CurrentTrainSettings {
	private boolean doorsOpen;
	private boolean doorsLocked;
	private boolean doorsBlocked;
	private boolean emergency;
	private boolean isRunning;
	private boolean brakesOn;

	public CurrentTrainSettings(Train train){
		doorsOpen = train.getDoors().get(0).isOpen();
		doorsLocked = train.getDoors().get(0).isLocked();
		doorsBlocked = train.getDoors().get(0).isBlocked();
		emergency = train.hasEmergency();
		isRunning = train.getEngine().isInMotion();
		brakesOn = train.getEngine().brakesAreOn();
	}
	
	public void setDoorsOpen(boolean areDoorsOpen){
		doorsOpen = areDoorsOpen;
	}
	
	public void setDoorsLocked(boolean areDoorsLocked){
		doorsLocked = areDoorsLocked;
	}
	
	public void setDoorsBlocked(boolean areDoorsBlocked){
		doorsBlocked = areDoorsBlocked;
	}
	
	public void setEmergency(boolean isEmergency){
		emergency = isEmergency;
	}
	
	public void setIsRunning(boolean isTrainRunning){
		isRunning = isTrainRunning;
	}
	
	public void setBrakesOn(boolean areBrakesOn){
		brakesOn = areBrakesOn;
	}
	
	public boolean getDoorsOpen(){
		return doorsOpen;
	}
	
	public boolean getDoorsLocked(){
		return doorsLocked;
	}
	
	public boolean getDoorsBlocked(){
		return doorsBlocked;
	}
	
	public boolean getEmergency(){
		return emergency;
	}
	
	public boolean getInMotion(){
		return isRunning;
	}
	
	public boolean getBrakesOn(){
		return brakesOn;
	}
	
}
