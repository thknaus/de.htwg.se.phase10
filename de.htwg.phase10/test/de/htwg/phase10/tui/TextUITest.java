package de.htwg.phase10.tui;

import org.junit.Before;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.se.phase10.Phase10Module;
import de.htwg.se.phase10.aview.tui.TextUI;
import de.htwg.se.phase10.controller.IPhase10Controller;
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

		
	}
}
