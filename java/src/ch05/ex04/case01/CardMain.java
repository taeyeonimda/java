package ch05.ex04.case01;

public class CardMain {
	public static void main(String[]args) {
		System.out.println("Card.width: "+Card.widgth);
		System.out.println("Card.height: "+Card.height);
		
		Card card1 = new Card();
		card1.kind = "Heart";
		card1.number = 7;	
		
		Card card2 = new Card();
		card2.kind ="Spade";
		card2.number = 4;
		
		System.out.printf("%s, %d, %d, %d\n",
				card1.kind, card1.number, card1.widgth, card1.height);
		System.out.printf("%s, %d, %d, %d\n",
				card1.kind, card1.number, Card.widgth, Card.height);
		
		Card.widgth = 30;
		Card.height = 40;
		System.out.printf("%s, %d, %d, %d\n",
				card1.kind, card1.number, card1.widgth, card1.height);
		System.out.printf("%s, %d, %d, %d\n",
				card1.kind, card1.number, Card.widgth, Card.height);
		
		card2.widgth = 50;
		card2.height = 60;
		System.out.printf("%s, %d, %d, %d\n",
				card2.kind, card2.number, card2.widgth, card2.height);
		System.out.printf("%s, %d, %d, %d\n",
				card2.kind, card2.number, Card.widgth, Card.height);
	}
}
