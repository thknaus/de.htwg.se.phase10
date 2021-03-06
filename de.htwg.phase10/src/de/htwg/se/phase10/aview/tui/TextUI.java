package de.htwg.se.phase10.aview.tui;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import de.htwg.se.phase10.controller.AddPlayer;
import de.htwg.se.phase10.controller.ExitGameEvent;
import de.htwg.se.phase10.controller.IPhase10Controller;
import de.htwg.se.phase10.controller.StartGame;
import de.htwg.se.phase10.controller.UpdateStack;
import de.htwg.se.phase10.util.observer.Event;
import de.htwg.se.phase10.util.observer.IObserver;


public class TextUI implements IObserver{
	
	private static final Logger LOGGER = LogManager.getLogger(TextUI.class.getName());
	protected IPhase10Controller controller;
	
	private int numberp = 1;
	private int numberpcount;
	
	private boolean quit;
	
	public TextUI(IPhase10Controller controller2) {
		controller = controller2;
		controller.addObserver(this);
		printMenu();
	}

	public boolean inputLine(String input) {
		if(newPlayer(input)){
			return true;
		}
		
		if ("1".equals(input)) {
			controller.setNewGame(true);
		} else if ("2".equals(input)) {
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
			LOGGER.info("ADDPLAYER - Player 1 name:");
			numberpcount++;
			return true;
		}else if(controller.checkNewGame() && numberpcount < numberp){
			controller.newPlayer(input);
			numberpcount++;
			return true;
		}else if(controller.checkNewGame() && numberpcount == numberp){
			controller.newPlayer(input);
			numberpcount++;
			return true;
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
		if(controller.getStack() != null){
			LOGGER.info("Stack: " + controller.getStack().toString());	
		}else{
			LOGGER.info("Stack: - empty -");
		}
		LOGGER.info("");
		LOGGER.info("Your Hand:");
		LOGGER.info(controller.getHand(number));
		LOGGER.info("");
		LOGGER.info("Current Phase:");
		LOGGER.info(controller.getCurrentPhase(number));
		LOGGER.info("");
		LOGGER.info("Press");
		LOGGER.info("d - Get Card from Deck, s - Get Card from Stack, f - Drop card stack (next Player)");
		LOGGER.info("a+number - Select a archive, y - check archive, n - new Archive, c+number - choose card, q - quit game");
	}
	private void printNewGame() {
		LOGGER.info("Choose a player number between 2 - 6: ");
	}

	public void printMenu() {
		LOGGER.info("Welcome to Phase 10");
		LOGGER.info("");
		LOGGER.info("1.) Start a new Game");
		LOGGER.info("2.) Quit");
	}

	
	public void printNewPlayer(String name) {
		if(numberpcount <= numberp){
			LOGGER.info(controller.getStatus()+ "-" + " Player " + controller.getNumberP() + " name:" + name);
		}
	}

	public boolean charInput(String input) {
		if(this.quit){
			return false;
		}
		char c = input.charAt(0);
		int number = 0;
		if(input.length() > 1){
			number = Integer.parseInt(input.substring(1));	
		}

		switch (c) {
		case 'd':
			if(!controller.getCardFromDeck()){
				LOGGER.info("You have already 11 Cards on your Hand.");
				break;
			}
			controller.setPulledCard();
			break;
		case 's':
			if(!controller.getCardFromStack()){
				LOGGER.info("You have already 11 Cards on your Hand.");
				break;
			}
			controller.setPulledCard();
			break;
		case 'f':
			if(!controller.pulledCard()){
				printPullCard();
				break;
			}
			controller.setDropedCardStack();
			LOGGER.info("Choose card: ");
			break;
		case 'a':
			if(!controller.pulledCard()){
				printPullCard();
				break;
			}
			if(controller.getCheckPhase()){
				if(controller.checkPhase(number)){
					LOGGER.info(controller.getStatus() + "-" + " Phase achieved! Get rid of all your cards.");
					controller.setCheckPhase();
					controller.setNextPhase();
				}else{
					LOGGER.info("Phase not completed");
					controller.setCheckPhase();
				}
				break;
			}
			controller.setArchive(number);
			LOGGER.info("Choose card: ");
			break;
		case 'n':
			if(!controller.pulledCard()){
				printPullCard();
				break;
			}
			controller.newArch();
			LOGGER.info(controller.getStatus() + "-" + " Choose card: ");
			break;
		case 'c':
			if(!controller.pulledCard()){
				printPullCard();
				break;
			}
			if(controller.getDropCardStack()){
				controller.dropCardStack(number);
				controller.setDropedCardStack();
				controller.setPulledCard();
				controller.setCurrentPlayerNumber();
				if(controller.checkStackTop()){
					controller.setCurrentPlayerNumber();
					LOGGER.info("Player skiped - Skip card");
				}
				if(controller.getRoundOver()){
					controller.startNewRound();
					LOGGER.info(controller.getStatus() + "-" + " Next ROUND!!!");
				}
				
				break;
			}
			controller.dropCardArchive(number);
			break;
		case 'y':
			controller.setCheckPhase();
			LOGGER.info("Select an Archive to check");
			break;
		case 'q':
			controller.quitGame();
			return false;
		default:
			return true;
		}
		printGameField(controller.getCurrentPlayerNumber(), controller.getCurrentPlayer().getName());
		return true;
	}
	public void printPullCard(){
		LOGGER.info("You have to pull a Card from Deck or Stack first.");
	}
	public void printQuitGame() {
		LOGGER.info(controller.getStatus() +"-"+ " Game closed...");
	}

	@Override
	public void update(Event e) {
		if(e instanceof ExitGameEvent){
			this.quit = true;
			printQuitGame();
		}else if(e instanceof StartGame){
			printNewGame();
		}else if(e instanceof AddPlayer){
			printNewPlayer(controller.getName());
		}else if(e instanceof UpdateStack){
			LOGGER.info("Card from Deck to Stack.");
		}else{
			printGameField(controller.getCurrentPlayerNumber(), controller.getCurrentPlayer().getName());
		}
	}
}
