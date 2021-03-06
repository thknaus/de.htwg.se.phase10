package de.htwg.phase10.model;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import de.htwg.se.phase10.model.*;
import de.htwg.se.phase10.model.impl.Card;
import de.htwg.se.phase10.model.impl.Deck;
import de.htwg.se.phase10.model.impl.Stack;

public class StackTest extends TestCase{
	private Stack stack;
	private Deck deck;
	private int size;
	private Card exampleCard = new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0);
	
	
	@Before
	public void setUp(){
		stack = new Stack();
		System.out.println(stack);
	}

	@Test
	public void testPushCardS(){
		stack.pushCardS(exampleCard);
		assertEquals(1, stack.getSizeS());
		
	}
	@Test
	public void testPullCardS(){
		assertNull(stack.pullCardS());
		stack.pushCardS(exampleCard);
		assertNotNull(stack.pullCardS());
	}
	
	@Test
	public void testBackToDeckS(){
		deck = new Deck();
		stack.pushCardS(deck.getNewCard());
		assertEquals(108,stack.backToDeckS(deck).getSize());
		
	}
	
	@Test
	public void testGetSizeS(){
		stack.pushCardS(exampleCard);
		assertEquals(1, stack.getSizeS());
	}
	@Test
	public void testRemoveLast(){
		Card d = new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0);
		stack.pushCardS(d);
		stack.removeLast();
		assertEquals(0, stack.getSizeS());
	}
	
	@Test
	public void testTopCard(){
		Card d = new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0);
		stack.pushCardS(d);
		assertEquals(d, stack.topCard());
	}
	
}