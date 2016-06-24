package de.htwg.phase10.model;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import de.htwg.se.phase10.model.*;
import de.htwg.se.phase10.model.impl.Card;
import de.htwg.se.phase10.model.impl.Deck;
import de.htwg.se.phase10.model.impl.PlayerHand;
import de.htwg.se.phase10.model.impl.Stack;
import de.htwg.se.phase10.model.impl.Card.Color;
import de.htwg.se.phase10.model.impl.Card.Rank;

public class PlayerHandTest extends TestCase{
	private PlayerHand hand;
	private Deck deck;
	private Card exampleCard = new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0);
	
	@Before
	public void setUp(){
		deck = new Deck();
		hand = new PlayerHand(deck, "TestPlayer");
	}
	@Test
	public void testGetName(){
		assertEquals("TestPlayer", hand.getName());
	}
	@Test
	public void testScore(){
		hand.setScore(10);
		assertEquals(10, hand.getScore());
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
		hand.setCardHand(exampleCard);
		Card[] handarray = hand.getHand();
		for(Card h : handarray){
			if(h.equals(exampleCard)){
				hand.dropCardH(h);
			}
		}
		assertNull(hand.dropCardH(exampleCard));
	}
	@Test
	public void testGetCardStack(){
		Stack s = new Stack();
		s.pushCardS(exampleCard);
		assertNotNull(hand.getCardStack(s));
		assertNull(hand.getCardStack(s));
	}
	@Test
	public void testSetCardH(){
		hand.setCardHand(exampleCard);
		assertTrue(hand.containsCard(exampleCard));
	}
	

	@Test
	public void testContainsCard(){
		hand.setCardHand(exampleCard);
		assertTrue(hand.containsCard(exampleCard));
	}
	
	@Test
	public void testContainsCardFalse(){
		Card[] handarray = hand.getHand();
		System.out.println(handarray.length);
		for(Card h : handarray){
			hand.dropCardH(h);
		}
		assertFalse(hand.containsCard(exampleCard));
	}

	@Test
	public void testCheckHandNull(){
		assertFalse(hand.checkHandNull());
		hand.cleanHand();
		assertTrue(hand.checkHandNull());
	}
	@Test
	public void testPushCardHand(){
		Card c = new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0);
		assertEquals(c, hand.pushCardH(c));
		assertEquals(null, hand.pushCardH(c));
	}
	@Test
	public void testGetCurrentPhase(){
		hand.setPhase("Phase 1");
		assertEquals("Phase 1", hand.getCurrentPhase());
	}
	@Test
	public void testSetCurrentPhaseAchieved(){
		hand.setCurrentPhaseAchieved(true);
		assertEquals(true, hand.getCurrentPhaseAchieved());
	}
	@Test
	public void testToString(){
		String s = hand.toString();
		assertEquals(s, hand.toString());
		hand.cleanHand();
		String d = hand.toString();
		assertEquals(d, hand.toString());
	}
	/*
	@Test
	public void getStackCard(){
		assertNotNull(hand.getStackCard());
	}*/
	
	
}
