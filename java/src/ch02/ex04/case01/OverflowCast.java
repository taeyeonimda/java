package ch02.ex04.case01;

public class OverflowCast {
	public static void main(String[] args) {
		byte b = 10;
		System.out.println(b);
		int i = b;
		i = (int)b;
		System.out.println("i: " + i);
		
		int i2 = 300;
		byte b2 = (byte)i2;
		System.out.println(b2);
	}
}
