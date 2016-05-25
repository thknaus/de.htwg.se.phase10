package de.htwg.phase10.model;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import de.htwg.se.phase10.model.*;

public class StackTest extends TestCase{
	private Stack firstStack;
	private int size;
	private Card exampleCard = new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0);
	
	@Before
	public void setUp(){
		firstStack = new Stack();
		System.out.println(firstStack);
	}

	@Test
	public void testPushCardS(){
		assert(firstStack.pushCardS(exampleCard));
	}
	@Test
	public void testPullCardS(){
		
		assertNotNull(firstStack.pullCardS());
	}
	
	@Test
	public void testBackToDeckS(){
		
	}
	
	@Test
	public void testGetSizeS(){
	
	}
	
}