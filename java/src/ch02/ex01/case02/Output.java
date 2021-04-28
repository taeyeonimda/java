package ch02.ex01.case02;

public class Output {
	public static void main(String[] args) {
			int score = 100;
			System.out.println(100); // parameter 매개변수	 매서드에게 주는 값 
			System.out.println(score);
			System.out.println(100+1);
			System.out.println(Math.random());
			
			System.out.print(200);
			System.out.print(300);
			System.out.print("\n"); //\n은 특수문자 
			
			System.out.printf("%b, %c, %d, %.1f, %s \n",  false, 'a', 10, 10.15, "hello"); //arguments
			System.out.printf("%5b, %-5c, %d, %5.2f, %s \n" , true, 'a', 10,  10.15, "hello");
			
			String name = "최한석";
			int age = 22;
			System.out.printf("%s은%d살입니다. ", name, age );
			System.out.println();
			System.out.println(name + "은" + age+"살입니다.");
	}
	
}
