package home.case02;

import java.util.Scanner;

public class Replace {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.println("b : ");
		int b = sc.nextInt();
		System.out.printf("a :%d, b : %d 가 저장되었습니다.", a , b);
		
		System.out.println("a, b 변수의 값을 교체합니다.");
		int tmp = a;
		a = b;
		b = tmp;		

		System.out.printf("a : %d, b : %d로 교체 하였습니다.", a, b);
	}
}
