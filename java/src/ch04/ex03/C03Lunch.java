package ch04.ex03;

public class C03Lunch {
	public static void main(String[]args) {
		int calorie = 0;
		int food = 0;
		
		while(calorie<30) {
			food = (int)(Math.random()*5);
			System.out.print(food+"cal.");
			if(food %5 ==0) {//상한음식이면
				System.out.println("뱉다");
				break;
			}
			System.out.println(" 먹다.");
			calorie +=food;
		}
		System.out.println(calorie+"cal만큼 먹었당.");
	}
}
