package ch05.ex03.case01;

public class TvMain {
	public static void main(String[]args) {
		Tv myTv = null;
		myTv = new Tv();
		myTv.setChannel(7);
		myTv.setPower(true);
		myTv.setColor("red");
		
		myTv.channelup();
		System.out.println("channel: "+myTv.getChannel());
		myTv.channeldown();
		System.out.println("channel: "+myTv.getChannel());
	}
}
