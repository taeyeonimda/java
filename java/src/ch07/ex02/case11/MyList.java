package ch07.ex02.case11;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	public static void main(String[]args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		System.out.println(list);
		
		for(int i: list) System.out.print(i +" ");
		System.out.println();
		
		System.out.println(list.get(0)); // index번호로 불러옴
		System.out.println(list.remove(0)); // inderx번호에 있던 값을지움
		System.out.println(list); 
		System.out.println(list.get(0));
		
		for(int i =0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
	}
}
