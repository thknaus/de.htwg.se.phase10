package de.htwg.phase10.model;
import org.junit.Before;
import org.junit.Test;

import de.htwg.se.phase10.model.impl.Archive;
import de.htwg.se.phase10.model.impl.Card;
import de.htwg.se.phase10.model.impl.Deck;
import de.htwg.se.phase10.model.impl.PlayerHand;
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
	public void testGetCurrentArchive(){
		Card c = hand.getHand()[0];
		archive.putCardToArchive(hand.getHand()[0]);
		assertEquals(c, archive.getArchive()[0]);
	}
	@Test
	public void testcleanArchive(){
		archive.cleanArchive();
		assertNotNull(archive.getArchive());
	}
	@Test
	public void testPutCardToArchiveTrue(){
		Card c = deck.getNewCard();
		archive.putCardToArchive(c);
		assertEquals(1, archive.getArchive().length);
	}
	@Test
	public void testPutCardToArchiveFalse(){
		Card c = deck.getNewCard();
		Card d = deck.getNewCard();
		archive.putCardToArchive(c);
		//assertFalse(archive.putCardToArchive(d));
	}
	@Test
	public void testGetCard(){
		Card c = deck.getNewCard();
		archive.putCardToArchive(c);
		assertEquals(c, archive.get(0));
	}
	@Test
	public void testSize(){
		Card c = deck.getNewCard();
		archive.putCardToArchive(c);
		assertEquals(1, archive.size());
	}
	@Test
	public void testToString(){
		assertEquals("Archive 10: Cards: ", archive.toString());
		Card c = deck.getNewCard();
		archive.putCardToArchive(c);
		String s = "Archive 10: Cards: "+ c.getRank() +"_"+ c.getColor() + ", ";
		assertEquals(s, archive.toString());
	}
}
