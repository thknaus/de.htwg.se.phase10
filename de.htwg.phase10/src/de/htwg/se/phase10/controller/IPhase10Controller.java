package de.htwg.se.phase10.controller;

import de.htwg.se.phase10.model.impl.Deck;
import de.htwg.se.phase10.model.impl.PlayerHand;

/**
 * @author Thomas
 *
 */
public interface IPhase10Controller {
	/**
	 * Sets a boolean to check if a new game has been started.
	 * @param newgame set true if a new game will be started
	 */
	void setNewGame(boolean newgame);
	/**
	 * Generates a new Deck for a new Game.
	 */
	void setNewDeck();
	/**
	 * Gets the current Deck.
	 * @return returns the Deck from the current game.
	 */
	Deck getDeck();
	/**
	 * Generates a new Stack
	 */
	void setNewStack();
	/**
	 * Gets the current Stack.
	 * @return returns the Top Card on the Stack as String
	 */
	String getStack();
	/**
	 * Checks if a new game has been started.
	 * @return true if new game, false if a game is running.
	 */
	boolean checkNewGame();
	/**
	 * Generates a new Player.
	 * @param name = New players name
	 */
	void newPlayer(String name);
	/**
	 * Get the hand from the currentplayer
	 * @return the hand from the current player
	 */
	PlayerHand getCurrentPlayer();
	/**
	 * Get the number from the current player
	 * @return number from current player
	 */
	int getCurrentPlayerNumber();
	/**
	 * Sets the current Player number to the next Player.
	 */
	void setCurrentPlayerNumber();
	/**
	 * Generates a new Archive to drop cards.
	 */
	void newArch();
	/**
	 * Drops the Card with number from the Current Players Hand to the currently selected archive
	 * @param number = card number from Player hand
	 */
	void dropCardArchive(int number);
	/**
	 * Select archive to which the next card will be droped
	 * @param number = archive number
	 */
	void setArchive(int number);
	/**
	 * Gets every archive
	 * @return String from every Archive with its cards.
	 */
	String getArchive();
	/**
	 * Drops the selected card to the Stack.
	 * @param number = card with number from Player Hand
	 */
	void dropCardStack(int number);
	/**
	 * @return true if next card goes to stack
	 */
	boolean getDropCardStack();
	/*
	void moveCard(int number);*/
	/**
	 * Gets a new card from Deck
	 * @return true if the player gets a new Card to his hand, false if already have pulled a card
	 */
	boolean getCardFromDeck();
	/**
	 * Gets the top Card from the stack.
	 * @return true if card has been pulled from Stack, false if not possible
	 */
	boolean getCardFromStack();
	/**
	 * Gets the hand from the Player
	 * @param number = number of the Player
	 * @return the Hand of the Player as String
	 */
	String getHand(int number);
	/**
	 * Gets the Current Phase from the Player
	 * @param number = Player number
	 * @return the Phase as String
	 */
	String getCurrentPhase(int number);
	/**
	 * @return if stackdrop is set true or false
	 */
	boolean getStackDrop();
	/**
	 * Sets stackdrop true if its false and false if its true
	 */
	void setDropedCardStack();
	/**
	 * Sets pulledcard true if its false and false if its true
	 */
	void setPulledCard();
	/**
	 * @return pulledcard true or false if a card was pulled or not.
	 */
	boolean pulledCard();
	
	void setCheckPhase();
	boolean getCheckPhase();
	boolean checkPhase(int a);
	void setCurrenPlayerNumber(int i);
}