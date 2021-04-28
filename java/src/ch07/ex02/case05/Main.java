package ch07.ex02.case05;

public class Main {
	public static void main(String[]args) {
		Cat[] cats = new Cat[3];
		cats[0]=new Cat("해롱이");
		cats[1]=new Cat("냐옹이");
		cats[2]=new Cat("새로미");
		//cats[2] = new Dog();
		
		for(Cat cat:cats) {System.out.println(cat);
	}
}
}