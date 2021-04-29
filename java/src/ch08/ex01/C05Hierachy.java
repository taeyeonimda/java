package ch08.ex01;

public class C05Hierachy {
	public void first() {
		try {
			int i = 3/0;
		}catch(ArithmeticException e) {
			System.out.println("first: ArithmeticException.");
		}catch(RuntimeException e) {
			System.out.println("first: RuntimeException");
		}catch (Exception e) {
			System.out.println("first: Exception");
		}
	}
	
	public void second() {
		try {
			int i = 3/ 0 ;
	/*	}
		catch (Exception e) {
			System.out.println("second: Exception");
		}*/
		}catch(RuntimeException e) {
			System.out.println("second: RuntimeException");
	}
	}
	public static void main(String[]args) {
		C05Hierachy hierachy = new C05Hierachy();
		hierachy.first(); 
		hierachy.second();
	}
}
