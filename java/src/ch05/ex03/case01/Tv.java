package ch05.ex03.case01;

public class Tv {
	private String color;
	private boolean power;
	private int channel;
	
	public void power() {
		power = !power;
	}
	public void channelup() {
		++channel;
	}
	public void channeldown() {
		--channel;
	}
	public String getColor() {
		return color;
	}
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
}
