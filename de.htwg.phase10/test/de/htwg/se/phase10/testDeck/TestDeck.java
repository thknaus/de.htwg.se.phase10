package de.htwg.se.phase10.testDeck;
import junit.framework.TestCase;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import de.htwg.se.phase10.phase10.*;
import de.htwg.se.phase10.phase10.Card.Color;
import de.htwg.se.phase10.phase10.Card.Rank;

public class TestDeck extends TestCase{
	private static Deck firstDeck;
	
	@Before
	public static void setUpDeck(){
		firstDeck = new Deck();
	}
	
	@Test
	public static void testNewDeck(){
		assertNotNull(firstDeck.newDeck());
	}
	
	@Test
	public static void testCleanDeck(){
		assertTrue(firstDeck.cleanDeck());
	}
	
	@Test
	public static void testGetNewCard(){
		assertNotNull(firstDeck.getNewCard());
	}
	
	public static void main(String []args){				
		setUpDeck();
		System.out.println(firstDeck);
		testNewDeck();
		System.out.println(firstDeck);
		testGetNewCard();
		Card c = firstDeck.getNewCard();
		System.out.println(c.getColor() + " " + c.getRank());
		testCleanDeck();
		System.out.println(firstDeck);
	}
}
