package home;

public class C0000 {
	public static void main(String[]args) {
		for(int i =1; i<=99; i++){
			
			System.out.print("  "+i);
			
			if(i%10==3 || i%10 ==6 ||i%10==9) 
				System.out.print("짝");
			if(i/10==3 || i/10 ==6 ||i/10==9) 
				System.out.print("짝");
			
			if(i%10==0 && i!=0) 
				System.out.println();
			
		}
		
	}
}
									
		
		
	

	




