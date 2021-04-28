package ch02.ex04.case02;

public class OverFlowCalc {
	public static void main(String[]args) {
			byte b = 126;
			System.out.println("b: " + b);
			b++;
			System.out.println("b: " + b);
			b++;
			System.out.println("b: " + b);
			
			short s  =32766;
			System.out.println("s: " + s);
			s++;
			System.out.println("s: " + s);
			s++;
			System.out.println("s: " + s);

			
	}
}
