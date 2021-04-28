package ch03.ex04.home;

import java.util.Scanner;

public class Sum {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("a는 ");
		int a = sc.nextInt();
		System.out.print("b는 ");
		int b =sc.nextInt();
		
		System.out.println("1+2는"+(a+b));
		System.out.printf("%d + %d 는 = %d",a, b ,a+b);
		
		sc.close();
	}
}
//