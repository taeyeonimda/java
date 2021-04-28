package ch02.ex02.home;

import java.util.Scanner;
import java.time.LocalDate;

public class Reservation2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int year = 0;
		int month = 0;
		int day = 0;
		
		System.out.println("공연 일자를 입력하세요.");
		System.out.print("년 : "); year = sc.nextInt();
		System.out.print("월 : "); month = sc.nextInt();
		System.out.print("일 : "); day = sc.nextInt();
		
		LocalDate date = LocalDate.of(year, month, day);
		System.out.println(date + "공연을 예매 했습니다.");
		System.out.println(date.minusDays(50) + "까지 환불이 가능합니다." );
	}
}
