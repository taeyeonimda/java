package ch08.ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C03TryCatchFinally {
	public static void main(String[] args) {
		PrintWriter out = null;
		int[] list = {1,2,3};
		
		try {
			out  = new PrintWriter(new FileWriter("c:/DEV/a.txt"));
			for(int i = 0; i<list.length; i++)
				out.println("list["+ i+"]"+list[i]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 exception");
		}catch(IOException e) {
			System.out.println("파일 Exception");
		}finally {
			if(out != null) out.close();
		}System.out.println("End");
	}
}
