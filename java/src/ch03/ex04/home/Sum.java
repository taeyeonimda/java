package ch03.ex04.home;

import java.util.Scanner;

public class Sum {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("aė ");
		int a = sc.nextInt();
		System.out.print("bė ");
		int b =sc.nextInt();
		
		System.out.println("1+2ė"+(a+b));
		System.out.printf("%d + %d ė = %d",a, b ,a+b);
		
		sc.close();
	}
}
//