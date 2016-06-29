package de.htwg.phase10.gui;

import org.junit.Before;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.se.phase10.Phase10Module;
import de.htwg.se.phase10.aview.gui.Phase10gui;
import de.htwg.se.phase10.aview.tui.TextUI;
import de.htwg.se.phase10.controller.IPhase10Controller;
import junit.framework.TestCase;

public class Phas10guiTest extends TestCase{
	
	private IPhase10Controller controller;
	private Phase10gui gui;
	@Before
	public void setUp(){
		Injector injector = Guice.createInjector(new Phase10Module());
		controller = injector.getInstance(IPhase10Controller.class);
	}
	@Test
	public void testGUI(){
		gui = new Phase10gui(controller);
		gui.setNofPlayer();
	}
	

}
