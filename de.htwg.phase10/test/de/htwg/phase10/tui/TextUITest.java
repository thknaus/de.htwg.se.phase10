package de.htwg.phase10.tui;

import org.junit.Before;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.se.phase10.Phase10Module;
import de.htwg.se.phase10.aview.tui.TextUI;
import de.htwg.se.phase10.controller.IPhase10Controller;
import de.htwg.se.phase10.model.impl.Card;
import junit.framework.TestCase;

public class TextUITest extends TestCase{
	private IPhase10Controller controller;
	@Before
	public void setUp(){
		Injector injector = Guice.createInjector(new Phase10Module());
		controller = injector.getInstance(IPhase10Controller.class);
	}
	
	@Test
	public void testTextUI(){
		TextUI tui = new TextUI(controller);
		tui.inputLine("1");
		tui.inputLine("2");
		tui.inputLine("test");
		tui.inputLine("test2");
		tui.inputLine("d");
		tui.inputLine("d");
		tui.inputLine("n");
		tui.inputLine("a1");
		tui.inputLine("c1");
		tui.inputLine("f");
		tui.inputLine("c2");

		tui.inputLine("f");
		tui.inputLine("s");
		controller.setCheckPhase();
		/*controller.dropCardStack(0);
		controller.dropCardStack(1);
		controller.dropCardStack(2);
		controller.dropCardStack(3);
		controller.dropCardStack(4);
		controller.dropCardStack(5);
		controller.dropCardStack(6);
		Card c1 = new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0);
		Card c2 = new Card(Card.Rank.EIGHT, Card.Color.BLUE, 0);
		Card c3 = new Card(Card.Rank.EIGHT, Card.Color.RED, 0);
		Card c4 = new Card(Card.Rank.ELEVEN, Card.Color.BLUE,0);
		Card c5 = new Card(Card.Rank.ELEVEN, Card.Color.YELLOW,0);
		Card c6 = new Card(Card.Rank.ELEVEN, Card.Color.GREEN,0);*/
		
		tui.inputLine("a1");
		tui.inputLine("d");
		tui.inputLine("s");
		tui.inputLine("y");
		tui.inputLine("q");
		
	}
}
