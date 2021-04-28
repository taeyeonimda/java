package ch02.ex01.case04;

public class Assign {
	public static void main(String[]args) {
		int a = 1;
		int b = 2;
		System.out.printf("%d, %d\n", a, b);
		
		a = b;
		System.out.printf("%d, %d\n", a, b);
		
		a = b + 1;
		System.out.printf("%d, %d\n", a, b);
	
		double d = Math.random(); //   이상-> [0.0  1.0) <-미만
		System.out.printf("%.2f", d);
	}
}
