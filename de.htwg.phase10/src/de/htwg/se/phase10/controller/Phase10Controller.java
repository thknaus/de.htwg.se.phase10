package de.htwg.se.phase10.controller;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;

import de.htwg.se.phase10.aview.tui.TextUI;
import de.htwg.se.phase10.model.Archive;
import de.htwg.se.phase10.model.Card;
import de.htwg.se.phase10.model.Deck;
import de.htwg.se.phase10.model.GamePhase;
import de.htwg.se.phase10.model.PlayerHand;
import de.htwg.se.phase10.model.Stack;

public class Phase10Controller extends Observable {
	private TextUI tui;
	private PlayerHand hand;
	
	private Archive[] arrayarch = new Archive[36];
	private int archsize;
	private boolean archdrop = false;
	private int currentarch;
	
	private boolean stackdrop = false;
	
	private boolean newgame = false;
	private int numberplayer;
	private int currentplayer = 1;
	
	private Deck deck;
	private Stack stack;
	private List<PlayerHand> playerlist;
	private GamePhase phase = new GamePhase();
	
	public Phase10Controller(){
		
	}
	
	public void setNewGame(boolean newgame){
		this.newgame = newgame;
	}
	public void setNewDeck(){
		deck = new Deck();
	}
	public Deck getDeck(){
		return this.deck;
	}
	public void setNewStack(){
		this.stack = new Stack();
		this.stack.pushCardS(this.deck.getNewCard());
	}
	public String getStack(){
		return this.stack.topCard().toString();
	}
	
	public boolean checkNewGame(){
		return newgame;
	}
	public void newPlayer(String name){
		numberplayer = numberplayer + 1;
		
		if(playerlist == null){
			playerlist = new LinkedList<>();
		}
		PlayerHand player = new PlayerHand(this.deck, name);
		playerlist.add(player);	
	}
	public PlayerHand getCurrentPlayer(){
		return playerlist.get(this.currentplayer);
	}
	public int getCurrentPlayerNumber(){
		return this.currentplayer;
	}
	public void setCurrentPlayerNumber(){
		if(this.currentplayer < this.numberplayer){
			this.currentplayer++;
		}else{
			this.currentplayer = 1;
		}
	}
	public void setCurrenPlayerNumber(int number){
		this.currentplayer = number;
	}

	public void newArch(){
		if(archsize != 0){
			archsize = archsize+1;
		}
		arrayarch[archsize] = new Archive(archsize);
	}
	public void newArchive(int number){
		Archive arch = new Archive(number);
	}
	public void dropCardArchive(int number){
		Card c = hand.getHand()[number];
		arrayarch[currentarch].putCardToArchive(c);
	}
	public void setArchive(int number){
		currentarch = number;
	}
	public String getArchive(){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<arrayarch.length; i++){
			if(arrayarch[i] == null){
				continue;
			}else{
				sb.append(arrayarch[i].getArchive());	
			}
		}
		return sb.toString();
	}
	public void stackFirstCard(){
		
	}

	public void setDropCardStack() {
		stackdrop = true;
	}
	public void dropCardStack(int number){

	}
	public boolean getDropCardStack(){
		return this.stackdrop;
	}
	public void moveCard(int number){
		if(stackdrop == true){
			stackdrop = false;
		}else if(archdrop == true){
			archdrop = false;
		}
	}

	public void getCardFromDeck() {
		Card c = this.deck.getNewCard();
		playerlist.get(this.currentplayer).pushCardH(c);
	}

	public void getCardFromStack() {
		Card c = this.stack.topCard();
		playerlist.get(this.currentplayer).pushCardH(c);
	}

	public String getHand(int number) {
		PlayerHand h = playerlist.get(number);
		return h.toString();
	}

	public String getCurrentPhase(int number) {
		PlayerHand h = playerlist.get(number);
		h.getCurrentPhase();
		return phase.getPhase(number);
	}
	
}
