package ch07.ex01.case07;

public class TestMain {
	public static void main(String[]args) {
		Human human = new Human();
		Kimchi kimchi = new Kimchi();
		Ramen ramen = new Ramen();
		
		human.eat(ramen);
		human.eat(kimchi);
		
		human.ate(ramen);
		human.ate(kimchi);
	}
}
