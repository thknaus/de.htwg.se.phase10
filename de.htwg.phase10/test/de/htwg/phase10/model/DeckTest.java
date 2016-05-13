package de.htwg.phase10.model;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import de.htwg.se.phase10.model.*;

public class DeckTest extends TestCase{
	private Deck firstDeck;
	
	@Before
	public  void setUp(){
		firstDeck = new Deck();
		System.out.println(firstDeck);
	}

	@Test
	public  void testNewDeck(){
		assertNotNull(firstDeck);
	}

	@Test
	public  void testCleanDeck(){
		assertNotNull(firstDeck);
		assertTrue(firstDeck.cleanDeck());
	}
	
	@Test
	public  void testGetNewCard(){
		assertNotNull(firstDeck.getNewCard());
	}
	@Test
	public void testBackToDeck(){
		int size = firstDeck.getSize();
		Card c = new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0);
		firstDeck.pushToDeck(c);
		assertEquals(size + 1, firstDeck.getSize());
	}
}
