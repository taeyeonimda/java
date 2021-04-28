package ch05.ex07.case01;

public class Stack {
	public void first() {
		System.out.println("first() 시작");	
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
		
		this.second();//second메서드 불러옴
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
		
		System.out.println("first()종료");
		
	}
	public void second() {
		System.out.println("second() 시작.");
		try {Thread.sleep(1000);}catch(Exception e) {}
		
		System.out.println("seoncd()종료");
		
		
	}
}
