package de.htwg.se.phase10.controller.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;

import de.htwg.se.phase10.aview.tui.TextUI;
import de.htwg.se.phase10.controller.IPhase10Controller;
import de.htwg.se.phase10.model.IDeck;
import de.htwg.se.phase10.model.IPlayerHand;
import de.htwg.se.phase10.model.IStack;
import de.htwg.se.phase10.model.impl.Archive;
import de.htwg.se.phase10.model.impl.Card;
import de.htwg.se.phase10.model.impl.Deck;
import de.htwg.se.phase10.model.impl.GamePhase;
import de.htwg.se.phase10.model.impl.PlayerHand;
import de.htwg.se.phase10.model.impl.Stack;

public class Phase10Controller implements IPhase10Controller {
	private TextUI tui;
	private PlayerHand hand;

	private Archive[] arrayarch = new Archive[36];
	private int archsize;
	private boolean archdrop = false;
	private int currentarch;
	
	private boolean stackdrop = false;
	private boolean pulledc = false;
	
	private boolean newgame = false;
	private int numberplayer;
	private int currentplayer;
	
	private Deck deck;
	private Stack stack;
	private List<PlayerHand> playerlist;
	
	private GamePhase phase = new GamePhase();
	private boolean checkPhase = false;
	
	private boolean checkArchive = false;
	
	private boolean roundOver = false;
	
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
		player.setPhase(phase.getPhase(0));
		playerlist.add(player);	
	}
	public PlayerHand getCurrentPlayer(){
		return playerlist.get(this.currentplayer);
	}
	public int getCurrentPlayerNumber(){
		return this.currentplayer;
	}
	public void setCurrentPlayerNumber(){
		if(this.currentplayer < this.numberplayer-1){
			this.currentplayer++;
		}else{
			this.currentplayer = 0;
		}
	}
	public void setCurrenPlayerNumber(int number){
		this.currentplayer = number;
	}

	public void newArch(){
		if(archsize == 0){
			arrayarch[archsize] = new Archive(1);
			archsize++;
			return;
		}
		archsize++;
		arrayarch[archsize] = new Archive(archsize);
	}

	public void dropCardArchive(int number){
		PlayerHand p = playerlist.get(this.currentplayer); 
		Card c = p.getHand()[number-1];
		arrayarch[currentarch].putCardToArchive(c);
		p.dropCardH(c);
	}
	public void setArchive(int number){
		currentarch = number-1;
	}
	public String getArchive(){
		if(this.archsize == 0){
			return " - no archives generated - ";
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<arrayarch.length; i++){
			if(arrayarch[i] == null){
				continue;
			}else{
				sb.append(arrayarch[i].toString());	
			}
		}
		return sb.toString();
	}

	public void dropCardStack(int number){
		PlayerHand p = playerlist.get(this.currentplayer);
		Card[] c = p.getHand();
		this.stack.pushCardS(p.dropCardH(c[number-1]));
		if(p.checkHandNull()){
			this.roundOver = true;
		}
	}
	public boolean getDropCardStack(){
		return this.stackdrop;
	}
	/*public void moveCard(int number){
		if(stackdrop == true){
			stackdrop = false;
		}else if(archdrop == true){
			archdrop = false;
		}
	}*/

	public boolean getCardFromDeck() {
		Card c = this.deck.getNewCard();
		if(playerlist.get(this.currentplayer).pushCardH(c) == null){
			return false; 
		}
		return true;
	}

	public boolean getCardFromStack() {
		Card c = this.stack.topCard();
		this.stack.removeLast();
		if(playerlist.get(this.currentplayer).pushCardH(c) == null){
			return false; 
		}
		return true;
	}

	public String getHand(int number) {
		PlayerHand h = playerlist.get(this.currentplayer);
		return h.toString();
	}

	public String getCurrentPhase(int number) {
		PlayerHand h = playerlist.get(number);
		return h.getCurrentPhase();
	}

	public void setDropedCardStack() {
		if(this.stackdrop == false){
			this.stackdrop = true;
		}else{
			this.stackdrop = false;
		}
			
	}
	public void setPulledCard(){
		if(this.pulledc == false){
			this.pulledc = true;
		}else {
			this.pulledc = false;
		}
	}
	public boolean pulledCard(){
		return this.pulledc;
	}

	public void setCheckPhase() {
		if(this.checkPhase == false){
			this.checkPhase = true;
		}else{
			this.checkPhase = false;
		}
	}

	public boolean getCheckPhase() {
		return this.checkPhase;
	}

	public boolean checkPhase(int a) {
		PlayerHand h = playerlist.get(this.currentplayer);
		if(phase.checkGamePhase(h.getCurrentPhase(), arrayarch[a-1])){
			h.setCurrentPhaseAchieved(true);
			return true;
		}
		return false;
	}
	public void setNextPhase(){
		PlayerHand p = playerlist.get(this.currentplayer);
		String pnumber = p.getCurrentPhase().toString();
		if(pnumber.startsWith("Phase 1")){
			p.setPhase(phase.getPhase(1));
		}else if(pnumber.startsWith("Phase 2")){
			p.setPhase(phase.getPhase(2));
		}else if (pnumber.startsWith("Phase 3")){
			p.setPhase(phase.getPhase(3));
		}else if (pnumber.startsWith("Phase 4")){
			p.setPhase(phase.getPhase(4));
		}else if (pnumber.startsWith("Phase 5")){
			p.setPhase(phase.getPhase(5));
		}else if (pnumber.startsWith("Phase 6")){
			p.setPhase(phase.getPhase(6));
		}else if (pnumber.startsWith("Phase 7")){
			p.setPhase(phase.getPhase(7));
		}else if (pnumber.startsWith("Phase 8")){
			p.setPhase(phase.getPhase(8));
		}else if (pnumber.startsWith("Phase 9")){
			p.setPhase(phase.getPhase(9));
		}else if (pnumber.startsWith("Phase 10")){
			p.setPhase(phase.getPhase(10));
		}
	}
	public boolean checkStackTop(){
		if(this.stack.topCard().getRank() == Card.Rank.SKIP){
			setCurrentPlayerNumber();
			return true;
		}
		return false;
	}
	public boolean getRoundOver(){
		return this.roundOver;
	}
	public void startNewRound(){
		for(PlayerHand h : playerlist){
			h.cleanHand();
			h.newHand();
			h.setCurrentPhaseAchieved(false);
		}
		for(Archive a : arrayarch){
			if(a == null){
				continue;
			}
			a.cleanArchive();
		}
		this.archsize = 0;
		stack.backToDeckS(this.deck);
		stack.pushCardS(deck.getNewCard());
	}

}

