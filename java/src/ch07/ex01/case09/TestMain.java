package ch07.ex01.case09;

public class TestMain {
	public static void main(String[]arsg) {
		Pistol pistol = new Pistol();
		Rifle rifle = new Rifle();
		Shooter shooter = new Shooter();
		
		shooter.setGun(rifle);
		shooter.fire();
		shooter.setGun(pistol);
		shooter.fire();
	}
}
