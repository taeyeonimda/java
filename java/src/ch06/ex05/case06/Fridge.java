package ch06.ex05.case06;

import ch06.ex05.case07.Appliance;
import ch06.ex05.case07.Electronic;

public class Fridge implements Appliance , Electronic{
	public void on() {}
	public void off() {}
	
	public void displayMsg() {}
	public  int getTemperature() {return 0;}
	public String getModelName() {return "";}
}

