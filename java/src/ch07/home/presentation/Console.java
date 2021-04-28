package ch07.home.presentation;

import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	public static int inNum(String msg) {
		System.out.print(msg +">>\n");
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	
	public static char inMsg(String msg) {
		System.out.println(msg);
		return  sc.nextLine().charAt(0);
		
	}
	
	
	public static void outNum(int num) {
		System.out.println(num + " ");
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void info(Object obj) {
		System.out.println(obj);
	}
}
