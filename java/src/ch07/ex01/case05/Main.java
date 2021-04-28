package ch07.ex01.case05;

public class Main {
	public static void main(String[]args) {
		Car car = new FireEngine();
		car.drive();
		//car.water  car는 Car타입이고 Car클래스는 water가없다
		
		
		FireEngine fireEngine = (FireEngine)car;
		fireEngine.water();
		fireEngine.drive();
		
		((Car)fireEngine).drive();
	}
}
