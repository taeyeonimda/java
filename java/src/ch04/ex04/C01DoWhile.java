package ch04.ex04;

import java.util.Scanner;

public class C01DoWhile {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		int a = 0;
		int b = 0;
		int result =0;
		
		do {
			System.out.print("숫자1입력 :\n");
			a=sc.nextInt();
			System.out.print("숫자2입력 :\n");
			b=sc.nextInt();
			result = a+b;
			System.out.printf("%d+%d=%d\n",a,b,result);
		}while(result !=0);
	
			System.out.println("합계가 0이되어 종료");
			sc.close();
	}
}
