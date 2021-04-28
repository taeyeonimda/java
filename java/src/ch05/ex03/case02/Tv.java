package ch05.ex03.case02;

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
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
}