package de.htwg.se.phase10.controller;

import java.util.Observable;

import de.htwg.se.phase10.aview.tui.TextUI;
import de.htwg.se.phase10.model.Archive;
import de.htwg.se.phase10.model.Card;
import de.htwg.se.phase10.model.PlayerHand;

public class Phase10Controller extends Observable {
	private TextUI tui;
	private PlayerHand hand;
	private Archive[] arrayarch = new Archive[36];
	private int archsize;
	private boolean archdrop = false;
	private boolean stackdrop = false;
	private int currentarch;
	public Phase10Controller(){
		
	}
	
	public void newGame(){
		
	}
	public void quitGame(){
		
	}
	public void allPhase(){
		
	}
	public void currentPhase(){
		
	}
	public void playerHand(){
		
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
	
	public void stackFirstCard(){
		
	}

	public void dropCardStack() {
		stackdrop = true;
	}
	public void moveCard(int number){
		if(stackdrop == true){
			stackdrop = false;
		}else if(archdrop == true){
			archdrop = false;
		}
	}

	public void getCardFromDeck() {
		
	}

	public void getCardFromStack() {
		
	}
	
}
