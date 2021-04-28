package ch05.ex08.case02;

public class CarMain {
	public static void main(String[]args) {
		Car car = new Car(); // 차를 일단 새로 만들고 아래와같은 정보를 나중에 입력
		car.setColor( "갈");
		car.setDoor( 4);
		System.out.println(car);
	
		car = new Car("빨간",4);//차를 처음 만들때부터 이와 같은 정보를 입력
		System.out.println(car);
}
}