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
			return charInput(input);
		}
		return true;
	}

	private boolean newPlayer(String input){
		if(!controller.checkNewGame()){
			return false;
		}
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
			printGameField(1,controller.getCurrentPlayer().getName());
			return true;
		}
		return false;
	}
	private void printGameField(int number, String name){
		System.out.println("##############################");
		System.out.println("Player " + name + " its your turn.");
		System.out.println("");
		System.out.println("Archive: "); 
		System.out.println(controller.getArchive());
		System.out.println("");
		System.out.println("Stack: " + controller.getStack());
		System.out.println("");
		System.out.println("Your Hand:");
		System.out.println(controller.getHand(number));
		System.out.println("");
		System.out.println("Current Phase: " + controller.getCurrentPhase(number));
		System.out.println("Press");
		System.out.println("y - done, d - Get Card from Deck, s - Get Card from Stack, f - Drop card stack");
		System.out.println("a+number - Select a archive, n - new Archive, c+number - choose card, q - quit game");
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

	public boolean charInput(String input) {
		char c = input.charAt(0);
		int number = 0;
		if(input.length() > 1){
			number = Integer.parseInt(input.substring(1));	
		}

		switch (c) {
		// get card from deck
		case 'd':
			if(!controller.getCardFromDeck()){
				System.out.println("You have already 10 Cards on your Hand.");
			}
			controller.setPulledCard();
			break;
		// get card from stack
		case 's':
			if(!controller.getCardFromStack()){
				System.out.println("You have already 10 Cards on your Hand.");
			}
			controller.setPulledCard();
			break;
		// drop to stack
		case 'f':
			if(controller.getStackDrop()){
				System.out.println("You have already droped a card. Continue with y");
				break;
			}
			if(!controller.pulledCard()){
				printPullCard();
				break;
			}
			controller.setDropedCardStack();
			System.out.println("Choose card: ");
			break;
		// choose archive
		case 'a':
			if(!controller.pulledCard()){
				printPullCard();
				break;
			}
			controller.setArchive(number);
			System.out.println("Choose card: ");
			break;
		// create new archive
		case 'n':
			if(!controller.pulledCard()){
				printPullCard();
				break;
			}
			controller.newArch();
			System.out.println("Choose card: ");
			break;
		// choose card for archive
		case 'c':
			if(controller.getDropCardStack()){
				controller.dropCardStack(number);
				break;
			}
			controller.dropCardArchive(number);
			break;
		case 'y':
			if(!controller.pulledCard()){
				printPullCard();
				break;
			}
			if(controller.getStackDrop()){
				controller.setCurrentPlayerNumber();
				controller.setDropedCardStack();
				controller.setPulledCard();
			}else{
				System.out.println("You have to drop a card first.");
			}
			break;
		case 'q':
			printQuitGame();
			return false;
		}
		printGameField(controller.getCurrentPlayerNumber(), controller.getCurrentPlayer().getName());
		return true;
	}
	public void printPullCard(){
		System.out.println("You have to pull a Card from Deck or Stack first.");
	}
	public void printQuitGame() {
		System.out.println("Game closed...");
	}

	public void printAllPhase10(GamePhase pall) {
		System.out.println();
	}
}
