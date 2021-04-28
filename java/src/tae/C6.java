package tae;

import java.util.Scanner;

public class C6 {
	public static void main(String[]args) {
		int kor = 0 , eng = 0 , math = 0;
		int total = 0;
		double avg = 0.0;
		char grade = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어:\n");
		kor = sc.nextInt();
		System.out.print("영어:\n");
		eng = sc.nextInt();
		System.out.print("수학:\n");
		math = sc.nextInt();
		
		total = kor+eng+math;
		avg = total/3.0;
		if(avg>=90) grade ='A';else if(avg>=80)grade ='B';else grade='C';
		
		System.out.printf("총점:%d\n평균:%.1f\n성적:%c\n",total,avg,grade);
		
	}
}
