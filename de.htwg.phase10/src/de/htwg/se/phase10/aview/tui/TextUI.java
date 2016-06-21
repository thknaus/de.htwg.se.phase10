package de.htwg.se.phase10.aview.tui;

import java.util.Scanner;

import de.htwg.se.phase10.controller.impl.Phase10Controller;
import de.htwg.se.phase10.model.Archive;
import de.htwg.se.phase10.model.GamePhase;
import de.htwg.se.phase10.model.PlayerHand;
import de.htwg.se.phase10.model.Stack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TextUI {
	
	private static final Logger LOGGER = LogManager.getLogger(TextUI.class.getName());
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
		LOGGER.info("##############################");
		LOGGER.info("Player " + name + " its your turn.");
		LOGGER.info("");
		LOGGER.info("Archive: "); 
		LOGGER.info(controller.getArchive());
		LOGGER.info("");
		LOGGER.info("Stack: " + controller.getStack());
		LOGGER.info("");
		LOGGER.info("Your Hand:");
		LOGGER.info(controller.getHand(number));
		LOGGER.info("");
		LOGGER.info("Current Phase:");
		LOGGER.info(controller.getCurrentPhase(number));
		LOGGER.info("");
		LOGGER.info("Press");
		LOGGER.info("y - done, d - Get Card from Deck, s - Get Card from Stack, f - Drop card stack");
		LOGGER.info("a+number - Select a archive, n - new Archive, c+number - choose card, q - quit game");
	}
	private void printNewGame() {
		LOGGER.info("Choose a player number between 2 - 6: ");
		controller.setNewGame(true);
		
	}

	public void printMenu() {
		LOGGER.info("Welcome to Phase 10");
		LOGGER.info("");
		LOGGER.info("1.) Start a new Game");
		LOGGER.info("2.) Quit");
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
				LOGGER.info("You have already 10 Cards on your Hand.");
			}
			controller.setPulledCard();
			break;
		// get card from stack
		case 's':
			if(!controller.getCardFromStack()){
				LOGGER.info("You have already 10 Cards on your Hand.");
			}
			controller.setPulledCard();
			break;
		// drop to stack
		case 'f':
			if(controller.getStackDrop()){
				LOGGER.info("You have already droped a card. Continue with y");
				break;
			}
			if(!controller.pulledCard()){
				printPullCard();
				break;
			}
			controller.setDropedCardStack();
			LOGGER.info("Choose card: ");
			break;
		// choose archive
		case 'a':
			if(!controller.pulledCard()){
				printPullCard();
				break;
			}
			controller.setArchive(number);
			LOGGER.info("Choose card: ");
			break;
		// create new archive
		case 'n':
			if(!controller.pulledCard()){
				printPullCard();
				break;
			}
			controller.newArch();
			LOGGER.info("Choose card: ");
			break;
		// choose card for archive
		case 'c':
			if(controller.getDropCardStack()){
				controller.dropCardStack(number);
				break;
			}else if(controller.getCheckPhase()){
				if(controller.checkPhase(number)){
					LOGGER.info("Phase achieved! Get rid of all of your cards.");
				}
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
				LOGGER.info("You have to drop a card first.");
			}
			break;
		case 'p':
			controller.setCheckPhase();
		case 'q':
			printQuitGame();
			return false;
		}
		printGameField(controller.getCurrentPlayerNumber(), controller.getCurrentPlayer().getName());
		return true;
	}
	public void printPullCard(){
		LOGGER.info("You have to pull a Card from Deck or Stack first.");
	}
	public void printQuitGame() {
		LOGGER.info("Game closed...");
	}

	public void printAllPhase10(GamePhase pall) {
		LOGGER.info("");
	}
}
