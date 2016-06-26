package de.htwg.se.phase10;

import java.util.Scanner;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.se.phase10.aview.tui.TextUI;
import de.htwg.se.phase10.controller.IPhase10Controller;
import de.htwg.se.phase10.controller.impl.Phase10Controller;
import de.htwg.se.phase10.model.impl.Deck;
import de.htwg.se.phase10.aview.tui.*;
import de.htwg.se.phase10.aview.gui.*;

public class Phase10 {

	
	protected static IPhase10Controller controller;
	private static Phase10 instance = null;
	
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new Phase10Module());
		controller = injector.getInstance(IPhase10Controller.class);
		
		TextUI tui = new TextUI(controller);
		
		Scanner input = new Scanner(System.in);
		
		//Phase10gui gui = new Phase10gui(controller);
		
		boolean checkinput = true;
		
		
		while(checkinput){
			checkinput = tui.inputLine(input.nextLine());
		}
		
		
		
		//Phase10 game = Phase10.getInstance();
		
		
	}
}
