package ch05.ex04.case02;

public class CardMain {
	public static void main(String[]args) {
		System.out.println("Card.width: "+Card.getWidht());	
		System.out.println("Card.height:"+Card.getHeight());
		
		Card.setWidht(10);
		Card.setHeight(20);
		Card card1 = new Card();
		card1.setKind("Heart");
		card1.setNumber(7);
		
		Card card2 = new Card();
		card2.setKind("Spade");
		card2.setNumber(4);
		
		Card.setWidht(30);
		Card.setHeight(40);
		System.out.printf("%s, %d, %d, %d\n",
				card1.getKind(),card1.getNumber(),card1.getWidht(),card1.getHeight());
		System.out.printf("%s, %d, %d, %d\n",
				card1.getKind(),card1.getNumber(),Card.getWidht(),Card.getHeight());
	}
}
