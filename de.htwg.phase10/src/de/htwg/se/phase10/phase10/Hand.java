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
		}
	}
	
	public int getSize(){
		return this.size;
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

	public Card dropCard() {
		return null;
	}

	public Card getNewCard() {
		return null;
	}
	
}
