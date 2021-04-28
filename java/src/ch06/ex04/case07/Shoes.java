package ch06.ex04.case07;

public class Shoes extends Product{
	private int price;
	
	public Shoes(int price) {
		super(price);// super 에있는 price는 product에있는 값이기때문에 protected를 써야만 사용가능하다
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String toString() {
		return String.format("%d원 할인해서 %d원에 판매",super.price,this.price);
	}
}
