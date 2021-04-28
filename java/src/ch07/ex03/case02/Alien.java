package ch07.ex03.case02;

public class Alien extends Life{
	//@Override 스태틱메서드는 오버라이딩안됨
	public static void eat() {
		System.out.println("Alien이 먹다");
	}
	
	@Override
	public void shout() {
		System.out.println("Alien이 소리치다");
	}
}
