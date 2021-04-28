package ch06.ex05.case11;

public class AppleSw implements SmartCar{
	public void start() {
		System.out.println("애플 방식으로 출발하다.");
	}
	
	public void stop() {
		System.out.println("애플 방식으로 멈추다.");
	}
	
	public void klaxon() {
		System.out.println("애플 방식으로 경적을 울리다.");
	}
}
