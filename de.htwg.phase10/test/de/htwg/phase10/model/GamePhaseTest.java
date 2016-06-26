package de.htwg.phase10.model;

import org.junit.Before;
import org.junit.Test;

import de.htwg.se.phase10.aview.gui.Archiv;
import de.htwg.se.phase10.model.impl.Archive;
import de.htwg.se.phase10.model.impl.Card;
import de.htwg.se.phase10.model.impl.Deck;
import de.htwg.se.phase10.model.impl.GamePhase;
import junit.framework.TestCase;

public class GamePhaseTest extends TestCase{
	private GamePhase gamephase;
	@Before
	public  void setUp(){
		gamephase = new GamePhase();
	}
	@Test
	public void testCheckGamePhase1(){
		Archive arch = new Archive(1);
		String p = "Phase 1: 2 triplet";
		
		Card c1 = new Card(Card.Rank.EIGHT, Card.Color.GREEN, 0);
		arch.putCardToArchive(c1);
		
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		
		Card c2 = new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0);
		Card c3 = new Card(Card.Rank.EIGHT, Card.Color.RED, 0);
		Card c4 = new Card(Card.Rank.ELEVEN, Card.Color.BLUE,0);
		Card c5 = new Card(Card.Rank.ELEVEN, Card.Color.YELLOW,0);
		Card c6 = new Card(Card.Rank.ELEVEN, Card.Color.GREEN,0);
		
		arch.putCardToArchive(c2);
		arch.putCardToArchive(c3);
		arch.putCardToArchive(c4);
		arch.putCardToArchive(c5);
		arch.putCardToArchive(c6);
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(c1);
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 0));
		arch.putCardToArchive(c3);
		arch.putCardToArchive(c4);
		arch.putCardToArchive(c5);
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 0));
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(c1);
		arch.putCardToArchive(c2);
		arch.putCardToArchive(c3);
		arch.putCardToArchive(c4);
		arch.putCardToArchive(c5);
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.YELLOW, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(c1);
		arch.putCardToArchive(c2);
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.YELLOW, 0));
		arch.putCardToArchive(c4);
		arch.putCardToArchive(c5);
		arch.putCardToArchive(c6);
		assertFalse(gamephase.checkGamePhase(p, arch));
	}
	@Test
	public void testCheckGamePhase2(){
		Archive arch = new Archive(1);
		String p = "Phase 2: 1 triplet + 1 row of four";
		
		Card c1 = new Card(Card.Rank.EIGHT, Card.Color.GREEN, 0);
		arch.putCardToArchive(c1);
		
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		
		Card c2 = new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0);
		Card c3 = new Card(Card.Rank.EIGHT, Card.Color.RED, 0);
		Card c4 = new Card(Card.Rank.ONE, Card.Color.BLUE, 0);
		Card c5 = new Card(Card.Rank.TWO, Card.Color.BLUE, 0);
		Card c6 = new Card(Card.Rank.THREE, Card.Color.BLUE, 0);
		Card c7 = new Card(Card.Rank.FOUR, Card.Color.BLUE, 0);

		
		arch.putCardToArchive(c2);
		arch.putCardToArchive(c3);
		arch.putCardToArchive(c4);
		arch.putCardToArchive(c5);
		arch.putCardToArchive(c6);
		arch.putCardToArchive(c7);
		int a = arch.size();
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(c1);
		arch.putCardToArchive(c2);
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 0));
		arch.putCardToArchive(c4);
		arch.putCardToArchive(c5);
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 0));
		arch.putCardToArchive(c7);
		assertTrue(gamephase.checkGamePhase(p, arch));
			
		arch.cleanArchive();
		arch.putCardToArchive(c1);
		arch.putCardToArchive(c2);
		arch.putCardToArchive(new Card(Card.Rank.ELEVEN, Card.Color.YELLOW, 0));
		arch.putCardToArchive(c4);
		arch.putCardToArchive(c5);
		arch.putCardToArchive(c6);
		arch.putCardToArchive(c7);
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(c1);
		arch.putCardToArchive(c2);
		arch.putCardToArchive(c3);
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.THREE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FIVE, Card.Color.BLUE, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
	}
	
	@Test
	public void testCheckGamePhase3(){
		Archive arch = new Archive(1);
		String p = "Phase 3: 1 quadruplet + 1 row of four";
		
		Card c1 = new Card(Card.Rank.EIGHT, Card.Color.GREEN, 0);
		arch.putCardToArchive(c1);
		
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		
		Card c2 = new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0);
		Card c3 = new Card(Card.Rank.EIGHT, Card.Color.RED, 0);
		Card c4 = new Card(Card.Rank.EIGHT, Card.Color.RED, 0);
		Card c5 = new Card(Card.Rank.ONE, Card.Color.BLUE, 0);
		Card c6 = new Card(Card.Rank.TWO, Card.Color.BLUE, 0);
		Card c7 = new Card(Card.Rank.THREE, Card.Color.BLUE, 0);
		Card c8 = new Card(Card.Rank.FOUR, Card.Color.BLUE, 0);

		
		arch.putCardToArchive(c2);
		arch.putCardToArchive(c3);
		arch.putCardToArchive(c4);
		arch.putCardToArchive(c5);
		arch.putCardToArchive(c6);
		arch.putCardToArchive(c7);
		arch.putCardToArchive(c8);
		int a = arch.size();
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(c1);
		arch.putCardToArchive(c2);
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 0));
		arch.putCardToArchive(c4);
		arch.putCardToArchive(c5);
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 0));
		arch.putCardToArchive(c7);
		arch.putCardToArchive(c8);
		assertTrue(gamephase.checkGamePhase(p, arch));
			
		arch.cleanArchive();
		arch.putCardToArchive(c1);
		arch.putCardToArchive(c2);
		arch.putCardToArchive(new Card(Card.Rank.ELEVEN, Card.Color.YELLOW, 0));
		arch.putCardToArchive(c4);
		arch.putCardToArchive(c5);
		arch.putCardToArchive(c6);
		arch.putCardToArchive(c7);
		arch.putCardToArchive(c8);
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(c1);
		arch.putCardToArchive(c2);
		arch.putCardToArchive(c3);
		arch.putCardToArchive(c4);
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.THREE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FIVE, Card.Color.BLUE, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
	}
	@Test
	public void testCheckGamePhase4(){
		Archive arch = new Archive(1);
		String p = "Phase 4: 1 row of seven";
		
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.THREE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FOUR, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FIVE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SIX, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SEVEN, Card.Color.BLUE, 0));
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.THREE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FOUR, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FIVE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SIX, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 0));
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.THREE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FOUR, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FIVE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SIX, Card.Color.BLUE, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.THREE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FOUR, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FIVE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SIX, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
	}
	
	@Test
	public void testCheckGamePhase5(){
		Archive arch = new Archive(1);
		String p = "Phase 5: 1 row of eight";
		
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.THREE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FOUR, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FIVE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SIX, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SEVEN, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0));
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.THREE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FOUR, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FIVE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SIX, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SEVEN, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 0));
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.THREE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FOUR, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FIVE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SIX, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SEVEN, Card.Color.BLUE, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.THREE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FOUR, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FIVE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SIX, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SEVEN, Card.Color.BLUE, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
	}
	
	@Test
	public void testCheckGamePhase6(){
		Archive arch = new Archive(1);
		String p = "Phase 6: 1 row of nine";
		
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.THREE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FOUR, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FIVE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SIX, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SEVEN, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.NINE, Card.Color.BLUE, 0));
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.THREE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FOUR, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FIVE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SIX, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SEVEN, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 0));
		arch.putCardToArchive(new Card(Card.Rank.NINE, Card.Color.BLUE, 0));
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.THREE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FOUR, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FIVE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SIX, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SEVEN, Card.Color.BLUE, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.THREE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FOUR, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FIVE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SIX, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SEVEN, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
	}
	
	@Test
	public void testCheckGamePhase7(){
		Archive arch = new Archive(1);
		String p = "Phase 7: 2 quadruplet";
		
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.THREE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FOUR, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FIVE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SIX, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SEVEN, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 1));
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 1));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		
	}
	
	@Test
	public void testCheckGamePhase8(){
		Archive arch = new Archive(1);
		String p = "Phase 8: 7 cards of the same color";
		
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 1));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 1));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.YELLOW, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
	}
	
	@Test
	public void testCheckGamePhase9(){
		Archive arch = new Archive(1);
		String p = "Phase 9: 1 quintuplet + 1 twin";
		
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.THREE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FOUR, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FIVE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SIX, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SEVEN, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 1));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 1));
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FIVE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 1));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
	}
	
	@Test
	public void testCheckGamePhase10(){
		Archive arch = new Archive(1);
		String p = "Phase 10: 1 quintuplet + 1 triplet";
		
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.THREE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FOUR, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FIVE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SIX, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.SEVEN, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 1));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 1));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FIVE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 1));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
	}
	
	@Test
	public void testReturnFalse(){
		Archive arch = new Archive(1);
		String p = "Phase 10asdf";
		assertFalse(gamephase.checkGamePhase(p, arch));
	}
	
	@Test
	public void testGetPhase(){
		String p = "Phase 1: 2 triplet";
		String a = gamephase.getPhase(0);
		assertEquals(p, gamephase.getPhase(0));
	}
}
