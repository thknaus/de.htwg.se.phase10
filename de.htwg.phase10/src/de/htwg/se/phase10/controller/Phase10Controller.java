package de.htwg.se.phase10.controller;

import java.util.Observable;

import de.htwg.se.phase10.aview.tui.TextUI;

public class Phase10Controller extends Observable {
	private TextUI tui;
	public Phase10Controller(){
		menu();
	}
	
	private void menu(){
		tui = new TextUI(this);
		tui.printMenu();
	}
	private void newGame(){
		tui.printNewGame();
	}
	private void quitGame(){
		tui.printQuitGame();
	}
	private void allPhase(){
		tui.printAllPhase10();
	}
	private void currentPhase(){
		tui.printCurrentPhase();
	}
	private void playerHand(){
		tui.printPlayerHand();
	}
	private void stackFirstCard(){
		tui.printStackFirstCard();
	}
	private void archive(){
		tui.printArchive();
	}
	
}
