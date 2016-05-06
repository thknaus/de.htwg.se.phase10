package de.htwg.se.phase10.testDeck;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import de.htwg.se.phase10.phase10.*;

public class TestDeck extends TestCase{
	private Deck firstDeck;
	
	@Before
	public  void setUp(){
		firstDeck = new Deck();
		System.out.println(firstDeck);
	}


	@Test
	public  void testNewDeck(){
		assertNotNull(firstDeck);
	}

	@Test
	public  void testCleanDeck(){
		assertNotNull(firstDeck);
		assertTrue(firstDeck.cleanDeck());
	}
	
	@Test
	public  void testGetNewCard(){
		assertNotNull(firstDeck.getNewCard());
	}
}
