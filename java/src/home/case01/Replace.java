package home.case01;

public class Replace {
	public static void main(String [] args) {
		 int a = 1; 
		 int b = 2; 
		 int tmp = a;
		 
		 System.out.printf("a: %d, b: %d\n", a , b);
		 
		tmp=a; 
		a=b; 
		b=tmp;
		
		System.out.printf("a: %d, b: %d\n",a, b);
						 
		 //결과 a=2 ,b =1 이 나오게
	}
}
