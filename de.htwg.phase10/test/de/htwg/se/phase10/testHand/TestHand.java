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
		
		System.out.println(hand);
	}
	
	@Test
	public void testGetHandH(){
		assertEquals(10, hand.getSizeH());
	}
	/*
	@Test
	public void testDropCard(){
		int size = hand.getSizeH();
		assertEquals(size-1, hand.dropCardH());
	}
	
	@Test
	public void testGetNewCard(){
		assertNotNull(hand.getNewCardH());
	}
	
	@Test
	public void getStackCard(){
		assertNotNull(hand.getStackCard());
	}*/
	
	
}
