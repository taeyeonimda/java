package tae;

import java.util.Scanner;

public class C4 {
	public static void mian(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두자리 정수를 입력해\n");
		String input = sc.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("입력내용:"+input);
		System.out.printf("num=%d\n",num);
		
		sc.close();
	}
}
