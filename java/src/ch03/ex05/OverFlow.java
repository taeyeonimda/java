package ch03.ex05;

public class OverFlow {
	public static void main(String[]args) {
		int a = 1000000;
		int b = 1000000;
		long c = a * b; 
		System.out.println(c);
		
		c = a*(long)b;
		System.out.println(c);
		
		int x = 1000000 * 1000000 / 1000000;
		System.out.println(x);
		int y = 1000000 / 1000000 * 1000000;
		System.out.println(y);
	}
}
