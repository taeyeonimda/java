package ch06.ex05.case10;

public class Main {
	public static void main(String[]args) {
		Console console = new Console();
		Browser browser = new Browser();
		
		console.display();
		browser.display();
		
		UI.input();
		//console.input(); 인터페이스에 있는 매서드는 클래스에서 불러올수없다.
	}
}
