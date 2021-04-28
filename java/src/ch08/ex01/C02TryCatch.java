package ch08.ex01;

public class C02TryCatch {
	public static void main(String[] args) {
		int[] array = new int[10];
		try{
			int result = array[10];
			if(result ==10) {
			System.out.println(result);
			}else {
				System.out.println("a");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("고장남");
		}
		System.out.println("end");
		
	}
}
