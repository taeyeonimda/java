package ch06.ex02.case01;

public class B {
	public void test() {
		A test = new A();
		int x = 0;
		
		//x = test.a;  A에 있는 private 접근제한자떄문에 사용불가
		x = test.b;
		x = test.c;
		x = test.d;
		
		//test.m1();
		test.m2();
		test.m3();
		test.m4();
	}
}
