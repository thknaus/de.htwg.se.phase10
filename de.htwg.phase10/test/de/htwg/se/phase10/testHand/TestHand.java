package de.htwg.se.phase10.testHand;

import org.junit.Before;
import org.junit.Test;

import de.htwg.se.phase10.phase10.Deck;
import de.htwg.se.phase10.phase10.Hand;
import junit.framework.TestCase;

public class TestHand extends TestCase{
	private Hand hand;
	private Deck deck;
	
	@Before
	public void setUp(){
		deck = new Deck();
		hand = new Hand(deck);
		
		System.out.println(hand);
	}
	
	@Test
	public void getHand(){
		assertEquals(10, hand.getSize());
	}
	@Test
	public void dropCard(){
		int size = hand.getSize();
		assertEquals(size-1, hand.dropCard());
	}
	
	@Test
	public void getNewCard(){
		assertNotNull(hand.getNewCard());
	}
	
	/*@Test
	public void getStackCard(){
		assertNotNull(hand.getStackCard());
	}*/
	
	
}
