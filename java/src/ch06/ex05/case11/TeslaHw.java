package ch06.ex05.case11;

public class TeslaHw implements SmartCar{
	private SmartCar software;
	
	public TeslaHw(SmartCar software) {
		this.software = software;
	}

	public void start() {
		software.start();
	}
	
	public void stop() {
		software.stop();
	}
	
	public void klaxon() {
		software.klaxon();
	}
}
