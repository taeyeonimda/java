package ch04.ex01;

public class C03If {
	public static void main(String[]args) {
		int hour = 24;
		if(hour<12) {
			System.out.println("Good Morning.");
		}else if(hour<18){ 
		System.out.println("Good Afternoon");
		}else if(hour<21) {
			System.out.println("Good evening");
	 	}else{
			System.out.println("Good night.");

}
	
		hour = 20;
		String bow = "" ;
		if (hour<12) bow = "Good Morning";
		else if (hour<18) bow = "Good Aternoon;";
		else if (hour<21) bow = "Good Evening";
		else bow = "Good Nigt.";
		System.out.println(bow);
}
}
