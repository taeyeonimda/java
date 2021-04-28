package ch06.ex03.case07;

public class Shooter {
	private Gun gun;  //dependency 의존객체
	
	public Shooter(Gun gun) {//dependency injection 의존주입? 줄여서 di
		this.gun = gun;
	}
	
	public void fire() {
		this.gun.fire();
	}
}
