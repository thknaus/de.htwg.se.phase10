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
		String p = "Phase 1";
		
		Card c1 = new Card(Card.Rank.EIGHT, Card.Color.GREEN, 0);
		arch.putCardToArchive(c1);
		
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		
		Card c2 = new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0);
		Card c3 = new Card(Card.Rank.EIGHT, Card.Color.RED, 0);

		
		arch.putCardToArchive(c2);
		arch.putCardToArchive(c3);
		
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(c1);
		arch.putCardToArchive(c2);
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 0));
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(c1);
		arch.putCardToArchive(c2);
		arch.putCardToArchive(new Card(Card.Rank.ELEVEN, Card.Color.YELLOW, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
	}
	@Test
	public void testCheckGamePhase2(){
		Archive arch = new Archive(1);
		String p = "Phase 2";
		
		Card c1 = new Card(Card.Rank.EIGHT, Card.Color.GREEN, 0);
		arch.putCardToArchive(c1);
		
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		
		Card c2 = new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0);
		Card c3 = new Card(Card.Rank.EIGHT, Card.Color.RED, 0);

		
		arch.putCardToArchive(c2);
		arch.putCardToArchive(c3);
		int a = arch.size();
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(c1);
		arch.putCardToArchive(c2);
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 0));
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.THREE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FOUR, Card.Color.BLUE, 0));
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(c1);
		arch.putCardToArchive(c2);
		arch.putCardToArchive(new Card(Card.Rank.ELEVEN, Card.Color.YELLOW, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.THREE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FIVE, Card.Color.BLUE, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.THREE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 1));
		assertTrue(gamephase.checkGamePhase(p, arch));
	}
	
	@Test
	public void testCheckGamePhase3(){
		Archive arch = new Archive(1);
		String p = "Phase 3";
		
		Card c1 = new Card(Card.Rank.EIGHT, Card.Color.GREEN, 0);
		arch.putCardToArchive(c1);
		
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		
		Card c2 = new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0);
		Card c3 = new Card(Card.Rank.EIGHT, Card.Color.RED, 0);
		Card c4 = new Card(Card.Rank.EIGHT, Card.Color.YELLOW, 0);
		
		arch.putCardToArchive(c2);
		arch.putCardToArchive(c3);
		arch.putCardToArchive(c4);
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(c1);
		arch.putCardToArchive(c2);
		arch.putCardToArchive(c3);
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 0));
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.THREE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FOUR, Card.Color.BLUE, 0));
		assertTrue(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(c1);
		arch.putCardToArchive(c2);
		arch.putCardToArchive(c3);
		arch.putCardToArchive(new Card(Card.Rank.ELEVEN, Card.Color.YELLOW, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.THREE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.FIVE, Card.Color.BLUE, 0));
		assertFalse(gamephase.checkGamePhase(p, arch));
		
		arch.cleanArchive();
		arch.putCardToArchive(new Card(Card.Rank.ONE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.TWO, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.THREE, Card.Color.BLUE, 0));
		arch.putCardToArchive(new Card(Card.Rank.JOKER, Card.Color.WHITE, 1));
		assertTrue(gamephase.checkGamePhase(p, arch));
	}
	@Test
	public void testCheckGamePhase4(){
		Archive arch = new Archive(1);
		String p = "Phase 4";
		
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
		String p = "Phase 5";
		
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
		String p = "Phase 6";
		
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
		String p = "Phase 7";
		
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
		String p = "Phase 8";
		
	}
}
