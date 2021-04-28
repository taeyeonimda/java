package ch05.ex08.case06;

public class Deposit {
	private int money;
	
	public Deposit() {
		this(100,0); // 3번째 생성자가 호출
	}
	
	public Deposit(int principal) {
		this(principal, 0);//3번째 생성자가 호출
	}
	
	public Deposit(int principal, int interest) {
		this.money = principal+interest;
	}
	
	public String toString() {
		return money+"";
	}
}
