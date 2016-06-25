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
	public void testGetCardFromDeck(){
		con.newPlayer("a");
		assertTrue(con.getCardFromDeck());
		con.getCardFromDeck();
		assertFalse(con.getCardFromDeck());
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
		con.dropCardStack(2);
		con.dropCardStack(3);
		con.dropCardStack(4);
		con.dropCardStack(5);
		con.dropCardStack(6);
		con.dropCardStack(7);
		con.dropCardStack(8);
		con.dropCardStack(9);
		con.dropCardStack(10);
		con.dropCardStack(11);
	}
	
	@Test
	public void testGetCardFromStack(){
		con.newPlayer("a");
		con.dropCardStack(1);
		assertTrue(con.getCardFromStack());
		con.getCardFromDeck();
		assertFalse(con.getCardFromStack());
	}
	@Test
	public void testGetDropCardStack(){
		assertFalse(con.getDropCardStack());
	}
	@Test
	public void testGetHand(){
		con.newPlayer("a");
		assertEquals(con.getHand(0).toString(), con.getHand(0).toString());
	}
	@Test
	public void testGetCurrentPhase(){
		con.newPlayer("a");
		assertEquals("Phase 1: 2 triplet", con.getCurrentPhase(0));
	}
	@Test
	public void testSetDropCardStack(){
		assertFalse(con.getDropCardStack());
		con.setDropedCardStack();
		assertTrue(con.getDropCardStack());
		con.setDropedCardStack();
		assertFalse(con.getDropCardStack());
	}
	@Test
	public void testSetPulledCard(){
		assertFalse(con.pulledCard());
		con.setPulledCard();
		assertTrue(con.pulledCard());
		con.setPulledCard();
		
	}
	@Test
	public void testSetCheckPhase(){
		assertFalse(con.getCheckPhase());
		con.setCheckPhase();
		assertTrue(con.getCheckPhase());
		con.setCheckPhase();
	}
	
	@Test
	public void testCheckPhase(){
		con.newPlayer("a");
		con.dropCardStack(1);
		con.dropCardStack(2);
		con.dropCardStack(3);
		con.getCurrentPlayer().pushCardH(new Card(Card.Rank.EIGHT,Card.Color.BLUE, 0));
		con.getCurrentPlayer().pushCardH(new Card(Card.Rank.EIGHT,Card.Color.GREEN, 0));
		con.getCurrentPlayer().pushCardH(new Card(Card.Rank.EIGHT,Card.Color.RED, 0));
		con.newArch();
		con.dropCardArchive(1);
		assertFalse(con.checkPhase(1));
		con.dropCardArchive(2);
		con.dropCardArchive(3);
		assertTrue(con.checkPhase(1));
	}
	@Test
	public void testSetNextPhase(){
		con.newPlayer("a");
		con.setNextPhase();
		con.setNextPhase();
		con.setNextPhase();
		con.setNextPhase();
		con.setNextPhase();
		con.setNextPhase();
		con.setNextPhase();
		con.setNextPhase();
		con.setNextPhase();
		con.setNextPhase();
	}
	@Test
	public void testCheckStackTop(){
		assertFalse(con.checkStackTop());
		con.newPlayer("a");
		con.dropCardStack(1);
		con.getCurrentPlayer().pushCardH(new Card(Card.Rank.SKIP, Card.Color.WHITE, 1));
		con.dropCardStack(1);
		assertTrue(con.checkStackTop());
	}
	@Test
	public void testRoundOver(){
		assertFalse(con.getRoundOver());
	}
	@Test
	public void testStartNewRound(){
		con.newPlayer("a");
		con.newPlayer("b");
		con.newArch();
		con.dropCardArchive(1);
		con.startNewRound();
		
	}
}
