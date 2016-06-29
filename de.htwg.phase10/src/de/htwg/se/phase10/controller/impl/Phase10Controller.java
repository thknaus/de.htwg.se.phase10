package de.htwg.se.phase10.controller.impl;

import java.util.LinkedList;
import java.util.List;

import de.htwg.se.phase10.aview.tui.TextUI;
import de.htwg.se.phase10.controller.AddPlayer;
import de.htwg.se.phase10.controller.ExitGameEvent;
import de.htwg.se.phase10.controller.GameStatus;
import de.htwg.se.phase10.controller.IPhase10Controller;
import de.htwg.se.phase10.controller.StartGame;
import de.htwg.se.phase10.controller.UpdateStack;
import de.htwg.se.phase10.model.impl.Archive;
import de.htwg.se.phase10.model.impl.Card;
import de.htwg.se.phase10.model.impl.Deck;
import de.htwg.se.phase10.model.impl.GamePhase;
import de.htwg.se.phase10.model.impl.PlayerHand;
import de.htwg.se.phase10.model.impl.Stack;
import de.htwg.se.phase10.util.observer.Observable;

public class Phase10Controller extends Observable implements IPhase10Controller {
	//private TextUI tui;
	//private PlayerHand hand;

	private Archive[] arrayarch = new Archive[36];
	private int archsize;
	//private boolean archdrop = false;
	private int currentarch;
	
	private boolean stackdrop = false;
	private boolean pulledc = false;
	
	private boolean newgame = false;
	private int numberplayer;
	private int currentplayer;
	private String name = "";
	
	private Deck deck;
	private Stack stack;
	private List<PlayerHand> playerlist;
	
	private GamePhase phase = new GamePhase();
	private boolean checkPhase = false;
	
	//private boolean checkArchive = false;
	
	private boolean roundOver = false;

	private GameStatus status = GameStatus.WELCOME;
	@Override
	public void setNewGame(boolean newgame){
		this.newgame = newgame;
		if(this.newgame){
			notifyObservers(new StartGame());
			setNewDeck();
			setNewStack();
			status = GameStatus.NEWGAME;
		}
	}
	@Override
	public boolean checkNewGame(){
		return newgame;
	}
	@Override
	public void quitGame(){
		notifyObservers(new ExitGameEvent());
		status = GameStatus.EXITGAME;
	}
	@Override
	public void setNewDeck(){
		deck = new Deck();
		status = GameStatus.NEWDECK;
	}
	@Override
	public Deck getDeck(){
		return this.deck;
	}
	@Override
	public boolean getCardFromDeck() {
		Card c = this.deck.getNewCard();
		if(playerlist.get(this.currentplayer).pushCardH(c) == null){
			return false; 
		}
		notifyObservers();
		return true;
	}
	
	@Override
	public void setNewStack(){
		this.stack = new Stack();
		this.stack.pushCardS(this.deck.getNewCard());
		status = GameStatus.NEWSTACK;
		notifyObservers(new UpdateStack());
	}
	@Override
	public Card getStack(){
		return this.stack.topCard();
	}
	
	@Override
	public void newPlayer(String name){
		numberplayer = numberplayer + 1;
		
		if(playerlist == null){
			playerlist = new LinkedList<>();
		}
		PlayerHand player = new PlayerHand(this.deck, name);
		player.setPhase(phase.getPhase(0));
		playerlist.add(player);
		status = GameStatus.ADDPLAYER;
		this.name = name;
		notifyObservers(new AddPlayer());
	}
	@Override
	public int getNumberP(){
		return this.numberplayer;
	}
	@Override
	public String getName(){
		return this.name;
	}
	@Override
	public PlayerHand getCurrentPlayer(){
		return playerlist.get(this.currentplayer);
	}
	@Override
	public int getCurrentPlayerNumber(){
		return this.currentplayer;
	}
	@Override
	public void setCurrentPlayerNumber(){
		if(this.currentplayer < this.numberplayer-1){
			this.currentplayer++;
		}else{
			this.currentplayer = 0;
		}
	}
	@Override
	public void setCurrenPlayerNumber(int number){
		this.currentplayer = number;
	}
	
	@Override
	public void newArch(){
		if(archsize == 0){
			arrayarch[archsize] = new Archive(1);
			archsize++;
			return;
		}
		archsize++;
		arrayarch[archsize] = new Archive(archsize);
		status = GameStatus.NEWARCHIVE;
	}
	@Override
	public void dropCardArchive(int number){
		PlayerHand p = playerlist.get(this.currentplayer); 
		Card c = p.getHand()[number-1];
		arrayarch[currentarch].putCardToArchive(c);
		p.dropCardH(c);
	}
	@Override
	public void setArchive(int number){
		currentarch = number-1;
	}
	@Override
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

	@Override
	public void dropCardStack(int number){
		PlayerHand p = playerlist.get(this.currentplayer);
		Card[] c = p.getHand();
		this.stack.pushCardS(p.dropCardH(c[number-1]));
		if(p.checkHandNull()){
			this.roundOver = true;
		}
	}
	@Override
	public boolean getCardFromStack() {
		Card c = this.stack.topCard();
		this.stack.removeLast();
		if(playerlist.get(this.currentplayer).pushCardH(c) == null){
			return false; 
		}
		notifyObservers(new UpdateStack());
		return true;
	}
	@Override
	public boolean getDropCardStack(){
		return this.stackdrop;
	}
	@Override
	public void setDropedCardStack() {
		if(this.stackdrop == false){
			this.stackdrop = true;
		}else{
			this.stackdrop = false;
		}
	}
	@Override
	public boolean checkStackTop(){
		if(this.stack.topCard().getRank() == Card.Rank.SKIP){
			setCurrentPlayerNumber();
			return true;
		}
		return false;
	}

	@Override
	public String getHand(int number) {
		PlayerHand h = playerlist.get(this.currentplayer);
		return h.toString();
	}
	@Override
	public String getCurrentPhase(int number) {
		PlayerHand h = playerlist.get(number);
		return h.getCurrentPhase();
	}

	@Override
	public void setPulledCard(){
		if(this.pulledc == false){
			this.pulledc = true;
		}else {
			this.pulledc = false;
		}
	}
	@Override
	public boolean pulledCard(){
		return this.pulledc;
	}
	@Override
	public void setCheckPhase() {
		if(this.checkPhase == false){
			this.checkPhase = true;
		}else{
			this.checkPhase = false;
		}
	}
	@Override
	public boolean getCheckPhase() {
		return this.checkPhase;
	}
	@Override
	public boolean checkPhase(int a) {
		PlayerHand h = playerlist.get(this.currentplayer);
		if(phase.checkGamePhase(h.getCurrentPhase(), arrayarch[a-1])){
			h.setCurrentPhaseAchieved(true);
			return true;
		}
		return false;
	}
	@Override
	public void setNextPhase(){
		PlayerHand p = playerlist.get(this.currentplayer);
		String pnumber = p.getCurrentPhase().toString();
		if(pnumber.startsWith("Phase 1: 2 triplet")){
			p.setPhase(phase.getPhase(1));
		}else if(pnumber.startsWith("Phase 2: 1 triplet + 1 row of four")){
			p.setPhase(phase.getPhase(2));
		}else if (pnumber.startsWith("Phase 3: 1 quadruplet + 1 row of four")){
			p.setPhase(phase.getPhase(3));
		}else if (pnumber.startsWith("Phase 4: 1 row of seven")){
			p.setPhase(phase.getPhase(4));
		}else if (pnumber.startsWith("Phase 5: 1 row of eight")){
			p.setPhase(phase.getPhase(5));
		}else if (pnumber.startsWith("Phase 6: 1 row of nine")){
			p.setPhase(phase.getPhase(6));
		}else if (pnumber.startsWith("Phase 7: 2 quadruplet")){
			p.setPhase(phase.getPhase(7));
		}else if (pnumber.startsWith("Phase 8: 7 cards of the same color")){
			p.setPhase(phase.getPhase(8));
		}else if (pnumber.startsWith("Phase 9: 1 quintuplet + 1 twin")){
			p.setPhase(phase.getPhase(9));
		}else if (pnumber.startsWith("Phase 10: 1 quintuplet + 1 triplet")){
			p.setPhase(phase.getPhase(0));
		}
	}
	@Override
	public boolean getRoundOver(){
		status = GameStatus.ROUNDOVER;
		return this.roundOver;
	}
	@Override
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
		status = GameStatus.NEXTROUND;
	}
	@Override
	public GameStatus getStatus() {
		return this.status;
	}
}

