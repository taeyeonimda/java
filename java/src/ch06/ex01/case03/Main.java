package ch06.ex01.case03;

public class Main {
	public static void main(String[]args) {
		Lion lion = new Lion();
		Leopard leopard = new Leopard();
		
		leopard.run();
		lion.run();
		
		leopard.eat();
		lion.shout();
	}
}
