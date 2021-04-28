package ch06.ex05.case12;

public class Main {
	public static void main(String[]args) {
		BusCard card = new BusCard() {
			public void tagOn() {
				System.out.println("태그 On");
			}
			public void tagOff() {
				System.out.println("태그 Off");
			}
	};
	
	card.tagOn();
	card.tagOff();
}
}