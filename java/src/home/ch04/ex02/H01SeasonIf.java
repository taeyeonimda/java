package home.ch04.ex02;

import java.util.Scanner;

public class H01SeasonIf {
	public static void main(String[]args) {
		int month = 0;
		String season = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월? ");
		month = sc.nextInt();
		
		if(3<=month && month<=5) season = "봄";
		else if(6<=month && month<=8) season ="여름";
		else if(9<=month && month<=11)season ="가을";
		else if(12==month || 1==month || 2==month)season = "겨울";
		else if (month>=13) season = "존재 하지않는 월";
		System.out.printf("%d월은 %s 입니다.",month,season);
	}
}
