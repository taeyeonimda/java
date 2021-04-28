package ch05.ex08.case05;

public class Citrus {
	private String name;
	
	public Citrus() {
		this("귤"); //this생성자 생성자지만 new와함께 사용하지않음
		//this.name = "귤";
	}
	public Citrus(String name) {
		this.name = name;
		
	}
	public String toString() {
		return name;
	}
}
