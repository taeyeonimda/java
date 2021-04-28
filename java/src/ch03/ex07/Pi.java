package ch03.ex07;

public class Pi {
	public static void main(String[]args) {
		double pi = 3.141592;
		double a =(int)pi;
		double b = a;
		System.out.println(b);
		
		double c = pi%1;
		System.out.println(c);
		double cc = c%100;
		double f = (int)c;
		System.out.printf("%.1f\n",f);
		System.out.println(cc);
		
		
		/*double ff = 3.141592;
		
		double result = ff - ff %1;
		System.out.println(result);
		
		result = Math.floor(ff);
		System.out.println(result);     같이 한거 */
		
		
	}
}
