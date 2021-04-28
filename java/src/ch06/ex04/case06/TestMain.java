package ch06.ex04.case06;

public class TestMain {
	public static void main(String[]args) {
		Shoes shoes = new Shoes(10000);
		System.out.println(shoes.getPrice());//shoes 클래스에서 getprice 
		//override했던거에서 만원가격그대로 가져옴
	}
}
