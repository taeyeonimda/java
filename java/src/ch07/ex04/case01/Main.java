package ch07.ex04.case01;

public class Main {
	public static void main(String[] args) {
		Day day = Day.TUSEDAY;
		
		String dayName = "";
		switch(day) {
		case MONDAY:	dayName = "월요일";break;
		case TUSEDAY: dayName = "화요일"; break;
		default: dayName = "수~일요일";
		}
		System.out.println(dayName);
	}
}
