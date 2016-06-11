package de.htwg.se.phase10.aview.tui;

import java.util.Scanner;

import de.htwg.se.phase10.controller.Phase10Controller;
import de.htwg.se.phase10.model.Archive;
import de.htwg.se.phase10.model.GamePhase;
import de.htwg.se.phase10.model.PlayerHand;
import de.htwg.se.phase10.model.Stack;
import src.de.htwg.sudoku.aview.tui.Matcher;
import src.de.htwg.sudoku.aview.tui.Pattern;
import src.de.htwg.sudoku.aview.tui.String;

public class TextUI {

	private static Scanner scanner;
	private Phase10Controller controller;

	private int numberp;
	private int numberpcount;
	
	public TextUI(Phase10Controller cont) {
		controller = cont;
		printMenu();
	}

	public boolean inputLine(String input) {
		if(controller.checkNewGame() && numberp == 0){
			this.numberp = Integer.parseInt(input);
			numberpcount++;
			System.out.println("Player 1 name:");
			return true;
		}else if(controller.checkNewGame() && numberpcount <= numberp){
			numberpcount++;
			printNewPlayer(input);
			return true;
		}else{
			controller.setNewGame(false);
		}
		
		if (input.equals("1")) {
			printNewGame();
			controller.setNewGame(true);
		} else if (input.equals("2")) {
			printQuitGame();
			controller.quitGame();
			return false;
		}else{
			charInput(input);
		}
			
		return true;
	}

	private void printNewGame() {
		System.out.println("Choose a player number between 2 - 6");
		controller.setNewGame(true);
		
	}

	public void printMenu() {
		System.out.println("Welcome to Phase 10");
		System.out.println("");
		System.out.println("1.) Start a new Game");
		System.out.println("2.) Quit");
	}

	
	public void printNewPlayer(String name) {
		controller.newPlayer(name);
		System.out.println("Player " + numberpcount + " name:");
	}

	public void charInput(String input) {
		char c = input.charAt(0);
		int number;
		if(input.length() > 1){
			number = Integer.parseInt(input.substring(1));	
		}
		
		switch (c) {
		// get card from deck
		case 'd':
			controller.getCardFromDeck();
			break;
		// get card from stack
		case 's':
			controller.getCardFromStack();
			break;
		// drop to stack
		case 'f':
			controller.dropCardStack();
			break;
		// choose archive
		case 'a':
			controller.setArchive(number);
			System.out.println("Choose card: ");
			break;
		// create new archive
		case 'n':
			controller.newArch();
			break;
		// choose card for archive
		case 'c':
			for(int i = 0; i < input.substring(1).length(); i++){
				controller.dropCardArchive(number);
			}
			break;
		}
	}

	public void printQuitGame() {
		System.out.println("Game closed...");
	}

	public void printAllPhase10(GamePhase pall) {
		System.out.println();
	}

	public void printCurrentPhase(GamePhase ps) {

	}

	public void printPlayerHand(PlayerHand h) {

	}

	public void printStackFirstCard(Stack stack) {

	}

	public void printArchive(Archive archive) {

	}

}
