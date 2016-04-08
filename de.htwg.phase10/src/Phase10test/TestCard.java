package Phase10test;
import java.util.LinkedList;

import de.htwg.phase10.*;
import de.htwg.phase10.Card.Color;
import de.htwg.phase10.Card.Rank;

public class TestCard {
	public static void main(String []args){		
		Deck d = new Deck();
		LinkedList<Card> cards = d.newDeck();
		
		System.out.println(cards);
		
	}
}
