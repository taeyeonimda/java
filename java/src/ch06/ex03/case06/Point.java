package ch06.ex03.case06;

public class Point {
	protected int x;
	protected int y; //상속받을꺼기때문에 protected 사용
	
	public Point(int x, int y) { // point 생성자는 int x,y파라미터값 같고 x,y로 돌려준다.
		this.x = x;
		this.y = y;
	}
}
