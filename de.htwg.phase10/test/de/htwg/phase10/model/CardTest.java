package de.htwg.phase10.model;
import org.junit.Before;
import org.junit.Test;

import de.htwg.se.phase10.model.impl.Card;
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
		assertNotNull(card.getSpecialC());
	}
	@Test
	public void testGetRankValue(){
		card = new Card(Card.Rank.ONE, Card.Color.BLUE, 0);
		assertEquals(1, card.getRankValue());
		card = new Card(Card.Rank.TWO, Card.Color.BLUE, 0);
		assertEquals(2, card.getRankValue());
		card = new Card(Card.Rank.THREE, Card.Color.BLUE, 0);
		assertEquals(3, card.getRankValue());
		card = new Card(Card.Rank.FOUR, Card.Color.BLUE, 0);
		assertEquals(4, card.getRankValue());
		card = new Card(Card.Rank.FIVE, Card.Color.BLUE, 0);
		assertEquals(5, card.getRankValue());
		card = new Card(Card.Rank.SIX, Card.Color.BLUE, 0);
		assertEquals(6, card.getRankValue());
		card = new Card(Card.Rank.SEVEN, Card.Color.BLUE, 0);
		assertEquals(7, card.getRankValue());
		card = new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0);
		assertEquals(8, card.getRankValue());
		card = new Card(Card.Rank.NINE, Card.Color.BLUE, 0);
		assertEquals(9, card.getRankValue());
		card = new Card(Card.Rank.TEN, Card.Color.BLUE, 0);
		assertEquals(10, card.getRankValue());
		card = new Card(Card.Rank.ELEVEN, Card.Color.BLUE, 0);
		assertEquals(11, card.getRankValue());
		card = new Card(Card.Rank.TWELVE, Card.Color.BLUE, 0);
		assertEquals(12, card.getRankValue());
		card = new Card(Card.Rank.JOKER, Card.Color.BLUE, 0);
		assertEquals(0, card.getRankValue());
		assertEquals(card.toString(), card.toString());
	}
}
