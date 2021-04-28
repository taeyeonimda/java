package ch05.ex02.case02;

public class ArithMain {
	public static void main(String[]args) {
		Arith arith = new Arith();
		arith.setFirstNum(3);
		arith.setSecondNum(2);
	
		System.out.println("덧셈: "+arith.add());
		System.out.println("뺄셈: "+arith.minus());
		System.out.println("곳셈: "+arith.multiply());
		System.out.println("나눗셈: "+arith.divide());

	}
}
