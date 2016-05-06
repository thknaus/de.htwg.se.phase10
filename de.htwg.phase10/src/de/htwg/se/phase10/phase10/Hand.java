package de.htwg.se.phase10.phase10;

import java.util.*;

public class Hand {

	private int size;
	private Card [] handcards = new Card[10];
	private Deck deck;
	
	public Hand (Deck d) {
		deck = d;
		for(int i = 0; i < 10; i++){
			Card c = deck.getNewCard();
			handcards[i] = c;
			size++;
		}
	}
	
	public int getSizeH(){
		return this.size;
	}
	public Card dropCardH() {
		return null;
	}

	public Card getNewCardH() {
		return null;
	}
	
	public Card pullCardH() {
		return null;
	}

	/**
	public void setacard() {
		Card s = Deck.getNewCard.;
	}
	
	public void newHand(Deck d) {
		for (int i = 0; i < 10; i++) {
			handcards.add(new Card(Card));
		}
	}
	**/
	
	@Override
	public String toString() {
		return "Hand [size=" + size + ", handcards=" + Arrays.toString(handcards) + ", deck=" + deck + "]";
	}
	
}
