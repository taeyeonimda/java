package ch03.ex03;

public class C01 {
	public static void main(String[]args) {
		
		int x = 10;
		System.out.printf("%s, %d\n",Integer.toBinaryString(x),x);
		x= -x;
		System.out.printf("%s, %d\n",Integer.toBinaryString(x),x);
		x= x+1;
		System.out.printf("%s, %d\n",Integer.toBinaryString(x),x);
		
	}
}
