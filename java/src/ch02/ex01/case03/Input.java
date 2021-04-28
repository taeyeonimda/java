package ch02.ex01.case03;

import java.util.Scanner;

public class Input {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 \n > ");
		String s = sc.nextLine(); 
		System.out.println(s+"를 입력.");
		
		System.out.print("숫자 입력\n> ");
		int a = sc.nextInt(); sc.nextLine();
		System.out.println(a + "를 입력.");   //숫자에 12를 쓰면 1,2,/n(엔터 특수문자)를 입력  int=a sc에서 /n는 인식하지못해 남아있게됨
		
		System.out.print("문자열 입력 \n >");
		s = sc.nextLine(); 
		System.out.println(s+"를 입력.");
		
		System.out.print("문자입력\n ");
		char c = sc.nextLine() .charAt(0);
		System.out.print(c + "를 입력");
	
	}
}
