package home.ch04;

import java.util.Scanner;

public class Calculator {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a =0;
		int b = 0;
		char op =0;
		int result =0;
		char repeat =0;
		
		do {
			System.out.print("숫자1:");
			a = sc.nextInt(); sc.nextLine();
			System.out.print("(+,-,*,/):");
			op = sc.nextLine().charAt(0);
			System.out.print("숫자2:");
			b = sc.nextInt();sc.nextLine();
			
			switch(op) {
			case '+': result = a+b; break;
			case '-': result = a-b; break;
			case '*':result = a*b; break;
			case '/':result = a/b;
			}
			System.out.printf("%d%c%d=%d\n",a,op,b,result);
			System.out.print("계속(y/n)?");
			repeat = sc.nextLine().charAt(0);
		}while (repeat =='y');
		System.out.println("끝");
	}
}
