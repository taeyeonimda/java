package ch06.ex04.case06;

public class Product {
	private int price;
	
	public Product(int price) {
		this.price = price*2;
	}
	
	public int getPrice() {
		return this.price;
	}
}
