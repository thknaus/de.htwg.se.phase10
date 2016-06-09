package de.htwg.se.phase10;

import java.util.Scanner;

import javax.swing.plaf.TextUI;

import de.htwg.se.phase10.controller.Phase10Controller;
import de.htwg.se.phase10.model.Deck;
import de.htwg.se.phase10.aview.tui.*;

public class Phase10 {

	
	protected static Phase10Controller controller;
	private static Phase10 instance = null;
	
	public static void main(String[] args) {
		controller = new Phase10Controller();
		
		//TextUI tui = new TextUI(new Phase10Controller());
		
		//Phase10 game = Phase10.getInstance();
		
		
	}
}
