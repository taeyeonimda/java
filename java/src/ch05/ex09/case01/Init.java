package ch05.ex09.case01;

public class Init {
	private static int s;
	private int i;
	
	static {
		s=1;
		System.out.println("static{}"); // static은 한번만실행 
	}
	{
		i= 1; s=1;
		System.out.println("{}");/* 인스턴스초기화블럭은 어떤생산자 앞에서든 실행되고 
		객체마다 다르게 생성하고싶은것은 생잔자 블럭에 사용하면됨*/						
	}
	public Init() {
		i = 1; s =1;
		System.out.println("Init()");

	}
	public Init(String s ) {
		System.out.println("Init"+s);
	}
	
}
