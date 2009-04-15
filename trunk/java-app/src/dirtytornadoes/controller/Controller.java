package dirtytornadoes.controller;

import dirtytornadoes.controller.train.Train;

public class Controller
{
	private Train train;
	private SerialIO serialIO;
	
	public Controller()
	{
		train = new Train();
		serialIO = new SerialIO();
	}
}
