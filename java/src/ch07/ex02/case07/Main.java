package ch07.ex02.case07;

public class Main {
	public static void main(String[]args) {
		Animal[] animals = new Animal[3];
		animals[0] = new Cat("고양이");
		animals[1] = new Dog("강아지");
		animals[2] = new Dog("왈왈이");
		
		for(Animal animal : animals)
		System.out.println(animal);
	}
}
