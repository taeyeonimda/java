package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class B {
	public void test() {
		A test = new A();
		int x = 0;
		
		//x=test.a;
	//	x =test.b;
		//x= test.c;
		x= test.d; // 접근제한자가 public 이여만 자유롭게 사용가능
		
		/*test.m1();
		test.m2();
		test.m3();*/ //4번 public 만 사용가능
		test.m4();
	}
}
