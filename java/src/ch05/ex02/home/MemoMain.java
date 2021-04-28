package ch05.ex02.home;

import java.util.Scanner;

public class MemoMain {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		Memo memo = new Memo();
		System.out.println("메세지를 남겨주세요.");
		memo.setMsg(sc.nextLine());
		System.out.println("누구세요?");
		memo.setName(sc.nextLine());
		
		System.out.println(memo.getMessage());
	}
}
