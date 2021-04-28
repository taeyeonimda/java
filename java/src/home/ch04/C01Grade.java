package home.ch04;

import java.util.Scanner;

public class C01Grade {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int kor = 0  , eng=0, math=0;
		int total = 0;
		double avg=0.0;
		String grade = "";
		System.out.print("국어:");
		kor = sc.nextInt();
		System.out.print("영어:");
		eng = sc.nextInt();
		System.out.print("수학:");
		math = sc.nextInt();
		total = kor+eng+math;
		System.out.println("총점"+total);
		avg=total/3.0;
		System.out.println("평균"+avg);
		
		if(avg>=90) grade="A";
		else if(avg>=80) grade= "B";
		else grade = "C";
		System.out.println("학점"+grade);
		
	}
}
