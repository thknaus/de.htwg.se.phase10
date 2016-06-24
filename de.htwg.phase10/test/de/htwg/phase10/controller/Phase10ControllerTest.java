package de.htwg.phase10.controller;

import org.junit.Before;
import org.junit.Test;

import de.htwg.se.phase10.controller.IPhase10Controller;
import de.htwg.se.phase10.controller.impl.Phase10Controller;
import de.htwg.se.phase10.model.impl.Card;
import de.htwg.se.phase10.model.impl.Deck;
import de.htwg.se.phase10.model.impl.PlayerHand;
import junit.framework.TestCase;

public class Phase10ControllerTest extends TestCase {
	protected IPhase10Controller con;
	@Before
	public void setUp(){
		con = new Phase10Controller();
		con.setNewDeck();
		con.setNewStack();
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
	public void testSetNewStack(){
		con.setNewStack();
		assertEquals(con.getStack(), con.getStack());
	}
	@Test
	public void testSetNewPlayer(){
		con.newPlayer("a");
		assertEquals("a", con.getCurrentPlayer().getName());
	}
	@Test
	public void testGetCurrentPlayerNumber(){
		con.newPlayer("a");
		assertEquals(0, con.getCurrentPlayerNumber());
	}
	@Test
	public void testSetCurrentPlayerNumber(){
		con.newPlayer("a");
		con.setCurrentPlayerNumber();
		con.setCurrenPlayerNumber(0);
		assertEquals(0, con.getCurrentPlayerNumber());
		con.newPlayer("b");
		con.setCurrentPlayerNumber();
		assertEquals(1, con.getCurrentPlayerNumber());
	}
	@Test
	public void testNewArchive(){
		assertEquals(" - no archives generated - ", con.getArchive());
		con.newArch();
		con.newArch();
		assertEquals("Archive 1: Cards: Archive 2: Cards: ", con.getArchive());
	}
	@Test
	public void testDropCardToArchive(){
		con.newArch();
		con.newPlayer("a");
		PlayerHand h = con.getCurrentPlayer();
		Card c = h.getHand()[0];
		con.setArchive(1);
		con.dropCardArchive(1);
		assertEquals("Archive 1: Cards: "+c.getRank() + "_" + c.getColor() +", ",con.getArchive());
	}
	
	@Test
	public void testDropCardStack(){
		con.newPlayer("a");
		PlayerHand h = con.getCurrentPlayer();
		Card c = h.getHand()[0];
		con.dropCardStack(1);
		System.out.println(con.getStack());
		assertEquals(c.getRank() + " " + c.getColor(),con.getStack());
		
	}


}
