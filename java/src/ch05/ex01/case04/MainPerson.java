package ch05.ex01.case04;

public class MainPerson {
	public static void main(String[]args) {
		Person person = new Person();
		person.setName("최한석");
		person.setAge(25);
		
		
		System.out.printf("이름:%s, 나이: %d",
				person.getName(),person.getAge());
	}
}
