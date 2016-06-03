package de.htwg.phase10.model;
import org.junit.Before;
import org.junit.Test;

import de.htwg.se.phase10.model.*;
import junit.framework.TestCase;

public class ArchiveTest extends TestCase{
	private Hand hand;
	private Deck deck;
	private Card exampleCard = new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0);
	private Archive archive;
	
	@Before
	public void setUp(){
		deck = new Deck();
		hand = new Hand(deck);
	}
	
	@Test
	public void testArchive(){
		//assertNotNull(archive.Archive();
	}
	@Test
	public void testcomplementArchive(){
		//assertNotNull(card.getColor());
	}
	@Test
	public void testcleanArchive(){
		assertNull(archive.cleanArchive());
	}
}
