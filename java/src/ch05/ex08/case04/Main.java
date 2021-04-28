package ch05.ex08.case04;

public class Main {
	public static void main(String[]args) {
		Apple apple = new Apple();
		/*Banana banana = new Banana(); 기본생성자가아니라 생성값이 있기떄문에 컴파일 에러*/ 
		Banana banana = new Banana("맛있어");
	}
}
