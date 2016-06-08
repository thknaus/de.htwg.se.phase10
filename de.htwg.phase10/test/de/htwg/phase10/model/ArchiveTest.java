package de.htwg.phase10.model;
import org.junit.Before;
import org.junit.Test;

import de.htwg.se.phase10.model.*;
import junit.framework.TestCase;

public class ArchiveTest extends TestCase{
	private PlayerHand hand;
	private Deck deck;
	private Card exampleCard = new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0);
	private Archive archive;
	
	@Before
	public void setUp(){
		deck = new Deck();
		hand = new PlayerHand(deck, "TestPlayer");
		archive = new Archive(10);
	}
	
	@Test
	public void testNewArchive(){		
		archive.newArchive(hand.getHand());
	}
	
	@Test
	public void testGetCurrentArchive(){
		archive.newArchive(hand.getHand());
		assertNotNull(archive.getArchive());
	}
	@Test
	public void testcleanArchive(){
		archive.cleanArchive();
		assertNull(archive.getArchive());
	}
	@Test
	public void testPutCardToArchiveTrue(){
		Card c = deck.getNewCard();
		assertTrue(archive.putCardToArchive(c));
	}
	@Test
	public void testPutCardToArchiveFalse(){
		archive.newArchive(hand.getHand());
		Card c = deck.getNewCard();
		Card d = deck.getNewCard();
		archive.putCardToArchive(c);
		assertFalse(archive.putCardToArchive(d));
	}
}
