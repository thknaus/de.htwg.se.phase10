package de.htwg.phase10.model;
import org.junit.Before;
import org.junit.Test;

import de.htwg.se.phase10.model.Card;
import junit.framework.TestCase;

public class CardTest extends TestCase{
	private Card card;
	
	@Before
	public void setUp(){
		card = new Card(Card.Rank.JOKER, Card.Color.WHITE, 1);
	}
	
	@Test
	public void testRank(){
		assertNotNull(card.getRank());
	}
	@Test
	public void testColor(){
		assertNotNull(card.getColor());
	}
	@Test
	public void testSpecialC(){
		int i = card.getSpecialC();
		assertNotNull(i == 1);
	}
}
