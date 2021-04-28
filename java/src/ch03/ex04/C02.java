package ch03.ex04;

public class C02 {
	public static void main(String[]args) {
			double pi = 3.141592;
			
			double shortPi = (int)(pi * 100 ) / 100d;
			System.out.println("shortPi : " +shortPi);
			
			shortPi = (int)(pi * 1000) / 1000d;
			System.out.println("shortPi : " + shortPi);
		
			shortPi = Math.round(pi*100000) / 100000d;
			System.out.println("shortPi : "+shortPi);
			
	}
}
