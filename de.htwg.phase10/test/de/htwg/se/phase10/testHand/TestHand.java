package de.htwg.se.phase10.testHand;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import de.htwg.se.phase10.phase10.*;

public class TestHand extends TestCase{
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
	public void testGetNewCardH(){
		testDropCardH();
		assertNotNull(hand.getNewCardH());
	}
	/*
	@Test
	public void getStackCard(){
		assertNotNull(hand.getStackCard());
	}*/
	
	
}
