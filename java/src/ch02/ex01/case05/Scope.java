package ch02.ex01.case05;

public class Scope {
	public static void main(String[]args) {
		int i = 0;
		//int i = 0;
		int j = 0;
		{
			i = 1;
			int x = 1 ;
			int y = 0 ;
		
		}
		int  x = 0;
		
		System.out.println(x);
		System.out.println(i);
	}
}
