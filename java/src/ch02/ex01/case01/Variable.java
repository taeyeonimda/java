package ch02.ex01.case01; // full name

public class Variable { // short name  풀네임 숏네임 사이 빈줄 하나가 관례
	public static void main(String[] args)//메서드 블락
	{	boolean bl = false; //8비트(1바이트) false true 2개 bl변수 선언 초기화했다. 논리형
		
		byte b = 0 ;
		short s = 0;
		char c = 0;
		int i = 0;
		long l = 0L; //변수와 상수 모두 64비트를 위해 뒤에 L입력 소문자로 할시 가독성이 떨어져 대문자로 선언 L을 안붙일시 int 타입과 착각 가능
		 					//정수형
	
		float f = 0.0f; // 연사자 옆 피연사자들은 서로 비트가 같아야 한다.
		double d = 0.0;//실수형
	
		String str =""; //empty string 빈문자열이 기본값
		
		int  x,y ;
		//int x; 위와같이 쓰면 가독성이 떨어짐 따로쓰는게 좋음
		//int y; 
		
		//int x=0, y=0;
		
	}

}
