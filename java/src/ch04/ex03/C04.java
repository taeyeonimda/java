package ch04.ex03;

public class C04 {
	public static void main(String[]args) {
		int calorie = 0;
		int food = 1;
		
		while(calorie<30 && food%5 !=0) {
			food = (int)(Math.random()*10)+1;
			if(food%5 != 0) {
				calorie+=food;
				System.out.printf("%dcal을 먹어. %dcal가 됐습니다.\n"
						,food, calorie);}
			else System.out.println("상해서 뱉었습니다. 그만먹습니다.");
				
			}
		}
}
