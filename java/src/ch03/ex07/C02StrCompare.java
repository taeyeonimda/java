package ch03.ex07;

public class C02StrCompare {
	public static void main(String[]args) {
		System.out.println('a' == 'a');
		System.out.println("a"=="a");		
		String s = "a";
		System.out.println(s == "a");
		s= new String("a");
		System.out.println(s == "a");    System.out.println();
		
		s= new String("a");
		System.out.println(s == "a");
		System.out.println(s.equals("a"));
		
		
	}
}
