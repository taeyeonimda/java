package ch08.ex01;

public class C06Throws {
	public void first() {
		try {
			second();
		}catch(ArithmeticException e) {
			System.out.println("first : ArithmenticException");
		}
	}
	
	public void second() {
		this.second();
	}
	
	public void third() {
		int i = 3/0;
	}
	
	public static void main(String[]args) {
		C06Throws t =  new C06Throws();
		t.first();
	}
}
