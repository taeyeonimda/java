package ch04.ex04;

import java.util.Scanner;

public class C02Length {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		int len = 0;
		
		do {
			System.out.println("입력 : ");
			input =sc.nextLine();
			len = input.length();
			System.out.println(len+"글자입력");
		}while(len ==0 || len>1);
	
		System.out.println("끝.");
		sc.close();
	}
}
