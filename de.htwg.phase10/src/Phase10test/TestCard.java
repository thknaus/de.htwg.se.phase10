package Phase10test;
import de.htwg.phase10.*;
import de.htwg.phase10.Card.Color;
import de.htwg.phase10.Card.Rank;

public class TestCard {
	public static void main(String []args){
		Card c = new Card(Rank.EIGHT, Color.BLUE);
		Card b = new Card(Rank.NINE, Color.RED);
		
		System.out.println(c);
		System.out.println(b);
		
	}
}
