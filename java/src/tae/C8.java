package tae;

import java.util.Scanner;

public class C8 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int me = 0;
		int ai = (int)(Math.random()*3)+1;
		String myChoice = "";
		String aiChoice = "";
		System.out.println("1.가위 2.바위 3.보");
		me = sc.nextInt();
		
		if(me==1)myChoice ="가위";else if(me==2)myChoice="바위";else if(me==3)myChoice="보";
		else myChoice="다시해";
		System.out.printf("나:%s\n",myChoice);
		
		if(ai==1)aiChoice ="가위";else if(ai==2)aiChoice="바위";else if(me==3)aiChoice="보";
		else myChoice="다시해";
		System.out.printf("알파고:%s\n",aiChoice);
		
		String s ="";
		if((me-ai)==1)s = "이김";
		
	}
}
	
