package ch05.ex01.case05;

public class PersonMain {
	public static void main(String[]args) {
		Person person = new Person();
		
		person.setName("최한석");
		person.setAge(25);
		System.out.printf("이름: %s, 나이: %d\n", 
				person.getName(7),person.getAge(7));
		person.setName("최한석");
		person.setAge(33);
		System.out.printf("이름: %s, 나이: %d\n", 
				person.getName(4),person.getAge(4));
		
		person.setName("최아름");
		person.setAge(33);
		System.out.printf("이름: %s, 나이: %d\n", 
				person.getName(7),person.getAge(7));
		
		person.name = "양승일";
		person.age = 50;
		String name = person.name;
		int age = person.age;
	
		System.out.println("이름:"+name+", 나이:"+age);
		
	}
}
