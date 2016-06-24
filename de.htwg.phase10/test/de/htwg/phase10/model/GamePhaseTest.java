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
	public void testCheckGamePhase(){
		Archive arch = new Archive(1);
		arch.putCardToArchive(Card.Rank.EIGHT, Card.Color.GREEN);
		arch.putCardToArchive(Card.Rank.EIGHT, Card.Color.GREEN);
		String p = "Phase 1";
		assertTrue(gamephase.checkGamePhase(p, arch));
		
	}
	
}
