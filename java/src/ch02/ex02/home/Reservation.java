package ch02.ex02.home;

import java.time.LocalDate;
import java.util.Scanner;

public class Reservation {
	public static void main(String[]args) {
		Scanner sc  = new Scanner(System.in);
		int year = 0;
		int day = 0;
		int month = 0;
		
		System.out.println("공연 관람일자를 입력하세요.");
		System.out.printf("년 : "); year =sc.nextInt(); 
		System.out.printf("월 : "); month = sc.nextInt();
		System.out.printf("일 : "); day = sc.nextInt();
		LocalDate date = LocalDate.of(year, month, day);
		System.out.println(date+"자 공연을 예매했습니다.");
		System.out.println(date.minusDays(3)+"까지 무료 환불이 가능합니다.");
		
		LocalDate.now();
		System.out.println("오늘은 " +LocalDate.now()+"일 입니다.");
	}
}

