package ch03.ex04;

public class C01 {
	public static void main(String[]args) {
		
		byte a = 3;
		byte b = 2;
		//byte c = a+b;  앞에는 byte타입의 변수인데 a+b로 할시 더 큰 int 타입으로 변환되기때문에 int로 바꾸거나 캐스팅변수후 바이트타입으로 변환
			
		byte c = (byte)(a+b);
		System.out.printf("c : %d\n",c);
		
		//c = c +1 ;
		c++;
		System.out.println(c);
		
		double d = a / b ;
		System.out.println("d : "+ d); // 뒤에/ 산술연산자가 먼저 계산되어서 인트타입에선
		
		d =(double) a / b;
		System.out.println("d : "+ d); // 더블 타입 캐스팅변환 하여 더블타입으로 출력
		
		d =1.0* a / b;
		System.out.println("d : "+ d);//1.0*a를 먼저해서 3.0 더블타입으로 바꾸고 그다음에 b를 계산 2.0으로 해서 더블타입 1.5로 결과 출력
		
		d = a / b *1.0;
		System.out.println("d : "+d);//앞에서 먼저 1.0으로 계산한뒤 1.0을 계산하므로 1.0
		
		d =(double)(a / b);
		System.out.println("d : "+d);
		
	}
}
