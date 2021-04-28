package ch07.ex02.case10;

public class AutoBoxing {
	public static void main(String[]args) {
		int a1 = 1;
		Integer a2 = new Integer(2);
		
		int a3 = new Integer(3);
		Integer a4 = 4;
		
		double b1 =1.0;
		Double b2 = new Double(1.0);
		double b3 = new Double(1.0);
		Double b4 = 1.0;
		
		boolean c1 = true;
		Boolean c2 = new Boolean(true);
		boolean c3 = new Boolean(true);
		Boolean c4 = true;
		
		System.out.printf("%d,%d,%d,%d",a1,a2,a3,a4);
	}
}
