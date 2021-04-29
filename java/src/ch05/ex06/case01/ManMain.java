package ch05.ex06.case01;

public class ManMain {
	public static void main(String[]args) {
		Man.say("자바를 땡떙합니다.");
		
		Man man = new Man();
		man.say("자바를 사랑합니다.");
		man.telll("하하");
		System.out.println(man.tell("안되는것"));

	}
}
