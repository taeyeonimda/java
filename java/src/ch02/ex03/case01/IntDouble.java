package ch02.ex03.case01;

public class IntDouble {
	public static void main(String[]args) {
			int i = 1;
			double d = 0.0;
			
			d = i; // promotion 더블을 인트로 처리하는 과정  작은수->큰수로 변환시만 프로모션
			System.out.println("d: " + d);
			//"d: " + 1.0   <- string string double 
			d = (double)i;
			System.out.println("d: " + d);
			
			i = (int)d;
			System.out.println("i: " + i);
			System.out.println("d: " + d);
	}
}
