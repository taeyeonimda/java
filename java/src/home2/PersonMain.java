package home2;

public class PersonMain {
	public static void main(String[]args) {
		Person person = new Person();
		person.setName("태연");
		person.setAge(25);
		
		System.out.printf("이름:%s\n나이:%d\n",
				person.getName(),person.getAge());
		
	}
}
