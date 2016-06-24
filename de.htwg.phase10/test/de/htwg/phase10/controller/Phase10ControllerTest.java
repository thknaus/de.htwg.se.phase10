package de.htwg.phase10.controller;

import org.junit.Before;
import org.junit.Test;

import de.htwg.se.phase10.controller.IPhase10Controller;
import de.htwg.se.phase10.controller.impl.Phase10Controller;
import de.htwg.se.phase10.model.impl.Card;
import de.htwg.se.phase10.model.impl.Deck;
import junit.framework.TestCase;

public class Phase10ControllerTest extends TestCase {
	protected IPhase10Controller con;
	@Before
	public void setUp(){
		con = new Phase10Controller();
	}
	@Test
	public void testSetNewGame(){
		con.setNewGame(true);
		assertTrue(con.checkNewGame());
	}
	@Test
	public void testSetNewDeck(){
		con.setNewDeck();
		Deck d = con.getDeck();
		assertEquals(d, con.getDeck());
	}
	
	@Test
	public void setNewStack(){
		con.setNewGame(true);
		con.setNewStack();
		assertEquals(con.getStack(), con.getStack());
	}
	@Test
	public void setNewPlayer(){
		con.newPlayer("a");
		assertEquals("a", con.getCurrentPlayer().getName());
	}

}
