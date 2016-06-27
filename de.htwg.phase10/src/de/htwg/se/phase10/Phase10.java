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
	private TextUI tui;
	private Phase10gui gui;
	private Phase10(){
		Injector injector = Guice.createInjector(new Phase10Module());
		controller = injector.getInstance(IPhase10Controller.class);
		tui = new TextUI(controller);
		gui = new Phase10gui(controller);
	}
	public static Phase10 getInstance(){
		if(instance == null){
			instance = new Phase10();
		}
		return instance;
		
	}
	
	public TextUI getTui(){
		return tui;
	}
	public Phase10gui getGui(){
		return gui;
	}
	
	public static void main(String[] args) {
		Phase10 game = Phase10.getInstance();
		
		Scanner input = new Scanner(System.in);
		
		boolean checkinput = true;
		
		
		while(checkinput){
			checkinput = game.getTui().inputLine(input.nextLine());
		}
		
		
		
		//Phase10 game = Phase10.getInstance();
		
		
	}
}
