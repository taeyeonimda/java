package ch06.ex04.case09;

public class ShinhanBank extends KoreaBank{
	public ShinhanBank(double rate) {
		super(rate);
	}
	
	public double getRate() {
		return super.getRate()+0.015;
	}
}
