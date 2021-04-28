package tae;

import java.util.Scanner;

public class C5 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int mainChoice = 0;
		int subChoice = 0;
		String prize = "";
		String brand = "";
		
		System.out.print("1.냉장고 2.세탁기 3.건조기\n");
		mainChoice = sc.nextInt();
		if(mainChoice ==1) prize = "냉장고";
		else if(mainChoice ==2) prize = "세탁기";
		else if(mainChoice ==3) prize = "건조기";
		
		if(mainChoice<=3)
		System.out.print("1.삼성 2.LG 3.대우\n");
		subChoice = sc.nextInt();
		if(subChoice ==1) brand = "삼성";
		else if(subChoice==2) brand = "LG";
		else if(subChoice==3)brand = "대우";
		else brand = "뽀삐휴지";	
		brand = brand+prize;
		System.out.printf(brand+"를 드립니다.");
		
		
	}
}
