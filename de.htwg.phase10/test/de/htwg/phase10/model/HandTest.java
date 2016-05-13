/*package de.htwg.phase10.model;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import de.htwg.se.phase10.model.*;
import de.htwg.se.phase10.model.Card.Color;
import de.htwg.se.phase10.model.Card.Rank;

public class HandTest extends TestCase{
	private Hand hand;
	private Deck deck;
	
	@Before
	public void setUp(){
		deck = new Deck();
		hand = new Hand(deck);
	}
	@Test
	public void testGetHand(){
		assertNotNull(hand.getHand());
	}
	@Test
	public void testGetHandSize(){
		assertEquals(10, hand.getSizeH());
	}
	
	@Test
	public void testDropCardH(){
		Card c = hand.getHand()[0];
		assertEquals(c, hand.dropCardH(c));
	}
	
	@Test
	public void testDropCardHfalse(){
		Card d = new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0);
		Card[] handarray = hand.getHand();
		for(Card h : handarray){
			if(h.equals(d)){
				hand.dropCardH(h);
			}
		}
		assertNull(hand.dropCardH(d));
	}
		
	@Test
	public void testSetCardH(){
		Card c = new Card(Rank.EIGHT,Color.YELLOW, 0);
		hand.setCardHand(c);
		assertTrue(hand.containsCard(c));
	}
	
	@Test
	public void testGetNewCardH(){
		testDropCardH();
		assertNotNull(hand.getNewCardH());
	}
	@Test
	public void testGetNewCardHNull(){
		hand.getNewCardH();
		assertNull(hand.getNewCardH());
	}

	/*
	@Test
	public void getStackCard(){
		assertNotNull(hand.getStackCard());
	}
	
	
}*/
