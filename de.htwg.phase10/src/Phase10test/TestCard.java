package Phase10test;
import junit.framework.TestCase;
import java.util.LinkedList;

import de.htwg.phase10.*;
import de.htwg.phase10.Card.Color;
import de.htwg.phase10.Card.Rank;

public class TestCard extends TestCase{
	private static Deck firstDeck;
	private CardInterface ci;
	public static void setUpDeck(){
		firstDeck = new Deck();
	}
	
	public static void testNewDeck(){
		assertNotNull(firstDeck.newDeck());
	}
	public static void testCleanDeck(){
		assertTrue(firstDeck.cleanDeck());
	}
	public static void testGetNewCard(){
		assertNotNull(firstDeck.getNewCard());
	}
	public static void main(String []args){				
		setUpDeck();
		System.out.println(firstDeck);
		testNewDeck();
		System.out.println(firstDeck);
		testGetNewCard();
		Card c = firstDeck.getNewCard();
		System.out.println(c.getColor() + " " + c.getRank());
		testCleanDeck();
		System.out.println(firstDeck);
		
	}
}
