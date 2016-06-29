package de.htwg.se.phase10.model.impl;


import de.htwg.se.phase10.model.IPlayerHand;

public class PlayerHand implements IPlayerHand{

	private String name;
	private int score;
	private int size;
	private Card [] handcards = new Card[11];
	private Deck deck;
	private Stack stack;
	private String phase;
	private boolean currentPhaseAchieved = false;
	// generatest a new hand
	public PlayerHand(Deck d, String n) {
		this.name = n;
		this.score = 0;
		this.deck = d;
		newHand();
	}
	public void newHand(){
		for(int i = 0; i < 11; i++){
			if(i == 10){
				handcards[i] = null;
			}else{
				Card c = deck.getNewCard();
				handcards[i] = c;
				size++;	
			}
		}
	}
	@Override
	public String getName(){
		return this.name;
	}
	@Override
	public int getScore(){
		return this.score;
	}
	@Override
	public void setScore(int s){
		this.score = this.score + s;
	}
	@Override
	// returns the current Hand
	public Card[] getHand(){
		return this.handcards;
	}
	@Override
	public boolean checkHandNull(){
		for(Card c: this.handcards){
			if(c != null){
				return false;
			}
		}
		return true;
	}
	
	// gets a new card from deck
	@Override
	public Card pushCardH(Card c) {
		for (int i = 0; i < handcards.length; i++){
			if (handcards[i] == null) {
				handcards[i] = c;
				this.size++;
				return handcards[i];
			}
		}
		return null;
	}
	
	// drops card c from hand
	@Override
	public Card dropCardH(Card c) {
		for (int i = 0; i < handcards.length; i++) {
			if(handcards[i] == null){
				continue;
			}
			if(handcards[i].equals(c)){
				handcards[i] = null;
				size--;
				return c;
			}
			continue;
		}
		return null;
	}
	
	// get current card from stack
	@Override
	public Card getCardStack(Stack s) {
		this.stack = s;
		for (int i = 0; i < handcards.length; i++){
			if (handcards[i] == null) {
				Card p = stack.pullCardS();
				handcards[i] = p;
				size++;
				return p;
			}			
		}
		return null;
	}
	
	// set new card to hand
	@Override
	public void setCardHand(Card c){
		for(int i = 0; i < handcards.length; i++){
			if(handcards[i] == null){
				handcards[i] = c;
			}
		}
	}
	
	// check if hand contains
	@Override
	public boolean containsCard(Card c){
		for(Card d : handcards){
			if(d == null){
				continue;
			}
			if(d.equals(c)){
				return true;
			}
		}
		return false;
	}
	
	// returns the current size of the hand
	@Override
	public int getSizeH(){
		return this.size;
	}
	@Override
	public String getCurrentPhase(){
		return this.phase;
	}
	@Override
	public void setPhase(String p){
		this.phase = p;
	}
	@Override
	public void cleanHand(){
		for(int i = 0; i<handcards.length; i++){
			handcards[i] = null;
		}
	}
	@Override
	public boolean getCurrentPhaseAchieved(){
		return currentPhaseAchieved;
	}
	@Override
	public void setCurrentPhaseAchieved(boolean p){
		this.currentPhaseAchieved = p;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(handcards != null){
			for(int i = 0; i < handcards.length; i++){
				Card c = handcards[i];
				int pos = i+1;
				if(c != null){
					sb.append(pos + ": ").append(c.getRank()).append("_").append(c.getColor()).append(", \n");					
				}else{
					sb.append("empty, \n");
				}
			}
		}
		sb.append("size: " + this.size);
		return sb.toString();
	}
}
