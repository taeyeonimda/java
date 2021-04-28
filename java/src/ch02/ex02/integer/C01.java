package ch02.ex02.integer;

public class C01 {
	public static void main(String[] args) {
		int x  = 10; //decimal 10진수
		
		System.out.println(Integer.toBinaryString(x));
		
		x = 012; //octal(8진수)
		System.out.println(Integer.toBinaryString(x));

		x = 0xA; //hexadecimal(16진수)
		System.out.println(Integer.toBinaryString(x));
		
		x = 0b1010; //(binary2진수 )
		System.out.println(Integer.toBinaryString(x));

		x = 1_234_567; //(_<- 첫단위를 나타내는 기호)
		System.out.println(x);
		
		double y = 1.1e1; //(e는 제곱 승 표시)
		System.out.println(y);
	}
}
