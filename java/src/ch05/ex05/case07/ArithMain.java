package ch05.ex05.case07;

public class ArithMain {
	public static void main(String[]args) {
		Arith arith = new Arith();
		int x = 10;
		int result = arith.toHalf(x);
		System.out.printf("x: %d\n result: %d",x,result);
	}
}
