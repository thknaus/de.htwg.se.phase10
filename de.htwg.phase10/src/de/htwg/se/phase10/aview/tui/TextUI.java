package de.htwg.se.phase10.aview.tui;

import java.util.Scanner;

import de.htwg.se.phase10.controller.Phase10Controller;
import de.htwg.se.phase10.model.Archive;
import de.htwg.se.phase10.model.GamePhase;
import de.htwg.se.phase10.model.PlayerHand;
import de.htwg.se.phase10.model.Stack;


public class TextUI {

	private static Scanner scanner;
	private Phase10Controller controller;

	private int numberp = 1;
	private int numberpcount;
	private String firstplayer;
	
	private boolean startgame = false;
	
	public TextUI(Phase10Controller cont) {
		controller = cont;
		printMenu();
	}

	public boolean inputLine(String input) {
		if(newPlayer(input)){
			return true;
		}
		
		if (input.equals("1")) {
			controller.setNewDeck();
			controller.setNewStack();
			printNewGame();
			controller.setNewGame(true);
		} else if (input.equals("2")) {
			printQuitGame();
			return false;
		}else{
			printGameField(controller.getCurrentPlayerNumber(),controller.getCurrentPlayerName());
			charInput(input);
		}
			
		return true;
	}

	private boolean newPlayer(String input){
		if(controller.checkNewGame() && numberp == 1){
			this.numberp = Integer.parseInt(input);
			numberpcount++;
			System.out.println("Player 1 name:");
			return true;
		}else if(controller.checkNewGame() && numberpcount < numberp){
			numberpcount++;
			printNewPlayer(input);
			return true;
		}else if(controller.checkNewGame() && numberpcount == numberp){
			numberpcount++;
			printNewPlayer(input);
		}
		if(numberpcount > numberp){
			controller.setNewGame(false);
			controller.setCurrenPlayerNumber(0);
			printGameField(1,controller.getCurrentPlayerName());
			return true;
		}
		return false;
	}
	private void printGameField(int number, String name){
		System.out.println("##############################");
		System.out.println("Player " + name + " its your turn.");
		System.out.println("Archive:");
		System.out.println("Stack: " + controller.getStack());
		System.out.println("Your Hand:" + controller.getHand(number));
		System.out.println("");
		System.out.println("Current Phase: " + controller.getCurrentPhase(number));
		System.out.println("Press d - Get Card from Deck, s - Get Card from Stack, f - Drop card stack, a+number - Play cards to archive, n - new Archive, c+number - choose card");
	}
	private void printNewGame() {
		System.out.println("Choose a player number between 2 - 6: ");
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
		if(numberpcount <= numberp){
			System.out.println("Player " + numberpcount + " name:");
		}
	}

	public void charInput(String input) {
		char c = input.charAt(0);
		int number = 0;
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
