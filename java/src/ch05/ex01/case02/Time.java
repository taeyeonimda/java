package ch05.ex01.case02;

public class Time {
	int hour;//Time 클래스 아래 구성된것들 멤버라고 부름 멤버 변수 
	int minute;	// 그외 일반적인것들은 local variable
	int second;
	
	public String toString() {
		return String.format("%d시%d분%d초", hour, minute, second);//toString이라는 메서드를 만들고 String타입으로 리턴이 된다.
	}
}
