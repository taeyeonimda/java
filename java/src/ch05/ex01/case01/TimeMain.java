package ch05.ex01.case01;

public class TimeMain {
	public static void main(String[]args) {
		int hour = 12;
		int minute = 25;
		int second =30;
		System.out.printf("%d시%d분%d초\n",hour,minute,second );
		
		
		Time time1 = new Time();
		time1.hour = 12;//time1이라는 주소를 찾아가고 그후에 hour를 찾아서 12값을 넣음
		time1.minute = 35;
		time1.second = 30;
		System.out.printf("%d시%d분%d초\n",time1.hour,time1.minute,time1.second );
		
		Time time2 = new Time();
		time2.hour = 10;
		time2.minute =30;
		time2.second =27;
		System.out.printf("%d시%d분%d초\n",time2.hour,time2.minute,time2.second );
		
		System.out.println(time1);//hashcode 해쉬펑션으로 객체의 주소값을 알려줌\
		System.out.printf("%s",time2);//같은 데이터타입 다른 객체
		
	}
}
