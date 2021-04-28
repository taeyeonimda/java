package ch05.ex01.home;

import java.time.LocalDate;
import java.util.Scanner;

public class ManMain {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		Man man = new Man();
		man.setName(name);
		man.setAge(age);
		man.setRegDate(LocalDate.now());
		
		System.out.printf("이름 :%s, 나이 :%d, 등록일: %s",
				man.getName(), man.getAge(),man.getRegDate());
		
	}
}
