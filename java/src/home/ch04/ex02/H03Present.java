package home.ch04.ex02;

import java.util.Scanner;

public class H03Present {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int mainChoice = 0;
		int subChoice = 0;
		String prize = "";
		String brand = "";
		
		System.out.print("1.냉장고, 2.세탁기\n");
		mainChoice = sc.nextInt();sc.nextLine();
		
		switch(mainChoice) {
		case 1: prize = "냉장고"; break;
		case 2: prize = "세탁기"; break;
		default : prize = "뽀삐 화장지";
		}
		
		switch(mainChoice) {
		case 1: case 2:
			System.out.print("1.삼성, 2.LG, 3.대우\n");
			subChoice = sc.nextInt();sc.nextLine();
			switch(subChoice) {
			case 1: brand = "삼성"; break;
			case 2: brand = "lg"; break;
			case 3: brand = "대우";
			default : prize = "뽀삐 화장지";
			}
		}
			System.out.printf("%s%s를 드립니다.",brand,prize);
			sc.close();
		}
}
