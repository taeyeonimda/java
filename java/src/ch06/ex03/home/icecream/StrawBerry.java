package ch06.ex03.home.icecream;

public class StrawBerry extends IceCream{
	private int price;
	
	public StrawBerry(String name, int price) {
		super(name);
		this.price = price;
	}

	public String toString() {
		return String.format("%s맛 아이스크림%d원",name,price);
	}
}
