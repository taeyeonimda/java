package tae;

import static java.lang.System.in;

import java.util.Scanner;

public class C7 {
	public static void main(String[]args) {
		int month = 0;
		String season = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월?\n");
		month = sc.nextInt();
		
		if(2<month&&month<=5)season="봄";
		else if (5<month&&month<=8)season="여름";
		else if (8<month&&month<=11)season="가을";
		else if (1 ==month ||12==month ||2==month )season="겨울";
		else season="없엉";
		
		System.out.printf("%d은%s입니다.",month,season);
		
	}
}
