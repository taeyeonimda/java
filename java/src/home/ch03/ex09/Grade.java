package home.ch03.ex09;

import java.util.Scanner;

//국 95 영 100 수 100
//총 295  평 98.3 학점A
public class Grade {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int ko = 0; 
		int en = 0;
		int math = 0;
		int total = 0;
		double avg = 0.0;
		char grade = 0;
		System.out.print("국어 : ");
		ko = sc.nextInt();
		System.out.print("영어 : ");
		en = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
		
		total = ko+en+math;
		System.out.printf("총점 : %d\n", total);
		avg = total/3.0;
		System.out.printf("평균 : %.1f\n", avg);
		grade = avg >=90 ? 'A' : (avg >=80 ? 'B' : avg >=70 ? 'C' : 'D');
		System.out.println(grade);
	}
}
