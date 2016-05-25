package de.htwg.se.phase10.model;

import java.util.*;

public class Hand {

	private int size;
	private Card [] handcards = new Card[11];
	private Deck deck;
	private Stack stack;
	
	// generatest a new hand
	public Hand(Deck d) {
		deck = d;
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
	
	// returns the current Hand
	public Card[] getHand(){
		return this.handcards;
	}
	
	// gets a new card from deck
	public Card getNewCardH() {
		for (int i = 0; i < handcards.length; i++){
			if (handcards[i] == null) {
				Card c = deck.getNewCard();
				handcards[i] = c;
				this.size++;
				return handcards[i];
			}
		}
		return null;
	}
	
	// drops card c from hand
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
	public void pullCardH(Card c) {
		for (int i = 0; i < handcards.length; i++){
			if (handcards[i] == null) {
				Card p = stack.pullCardS();
				handcards[i] = p;
				size++;
			}			
		}
		System.out.println("Bereits 10 Karten auf der Hand");
	}
	
	// set new card to hand 
	public void setCardHand(Card c){
		for(int i = 0; i < handcards.length; i++){
			if(handcards[i] == null){
				handcards[i] = c;
			}
		}
	}
	
	// check if hand contains
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
	public int getSizeH(){
		return this.size;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(handcards != null){
			for(Card c : handcards){
				sb.append(c.getRank()).append("_").append(c.getColor()).append(", \n");
			}
		}
		sb.append("size: " + this.size);
		return sb.toString();
	}
}
