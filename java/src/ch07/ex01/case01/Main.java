package ch07.ex01.case01;

public class Main {
	public static void main(String[]args) {
		C c = new C();
		B b = c;
		A a = c; //상속관계에서도 casting promotion 작동
		
		c =(C)b;
		b= (B)a;
		c = (C)b;;
	}
}
