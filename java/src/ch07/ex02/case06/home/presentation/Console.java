package ch07.ex02.case06.home.presentation;

import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	public static int inNUm(String msg) {
		System.out.print(msg + "\n>>");
		int num = sc.nextInt();sc.nextLine();
		return num;
	}
	
	public static void outNum(int num) {
		System.out.print(num+" ");
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void info(Object obj) {
		System.out.println(obj);
	}
}
