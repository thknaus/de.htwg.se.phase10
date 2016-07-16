package de.htwg.phase10.model;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import de.htwg.se.phase10.model.*;
import de.htwg.se.phase10.model.impl.Card;
import de.htwg.se.phase10.model.impl.Deck;

public class DeckTest extends TestCase{
	private Deck firstDeck;
	
	@Before
	public  void setUp(){
		firstDeck = new Deck();
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
	public void testPushToDeck(){
		Card c = new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0);
		assertFalse(firstDeck.pushToDeck(c));
		firstDeck.getNewCard();
		assertTrue(firstDeck.pushToDeck(c));
	}
	@Test
	public void testGetSize(){
		assertEquals(108, firstDeck.getSize());
	}
}
