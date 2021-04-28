package ch06.ex03.home.circle;

public class Circle {
	private int radius;
	private Point point;
	
	public Circle(int x,int y, int radius) {
		point = new Point();
		this.radius = radius;
	}
	
	public String toString() {
		return String.format("중심점: %d,%d\n반지름:%d", 
				point,this.radius);
	}
}
