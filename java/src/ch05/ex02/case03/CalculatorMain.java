package ch05.ex02.case03;

public class CalculatorMain {
	public static void main(String[]args) {
		Calculator cal = new Calculator();
		
		System.out.println("덧셈: "+cal.add(1,2));
		System.out.println("뺄셈: "+cal.minus(3,4));
		System.out.println("곳셈: "+cal.multiply(5,6));
		System.out.println("나눗셈: "+cal.divide(16,8));
	}
}
