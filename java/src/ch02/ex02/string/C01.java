package ch02.ex02.string;

public class C01 {
	public static void main(String[] args) {
			int a = 1;
			int b = 2;
			int c = 3;
			int sum = a+b+c;
			
			System.out.printf("Sum:  %d\n",sum);
			
			String concat = "" + a + b + c ; 	// 앞에 ""를 넣어서 string 타입으로 변환 하고 스트링타입으로 변환되어서 컴파일 에러가 뜨지않음
			System.out.println("Concat: " + concat);
			
			String a2 = ""+a;
			System.out.println("a2: " +a2);
			
			concat = a + b + c + "" ; 
			System.out.println("Concat: " + concat);
		
			String dialog = "Taeyeon," + "\"Hello\"";
			System.out.println(dialog);
	}
}
