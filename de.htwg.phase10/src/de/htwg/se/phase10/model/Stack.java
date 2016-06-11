package de.htwg.se.phase10.model;

import java.util.Collections;
import java.util.LinkedList;

public class Stack {
	private LinkedList<Card> stack;
	private Deck deck;
	public Stack() {
		stack = new LinkedList<Card>();
	}

	public Card pullCardS() {
		if(stack.size() == 0){
			return null;
		}
		Card c = stack.getLast();
		stack.removeLast();
		return c;
	}

	
	public void pushCardS(Card c) {
		stack.add(c);
	}
	
	public Deck backToDeckS(Deck d) {
		this.deck = d;
		if (stack.size() >= 1) {
			for(Card sc : stack){
				this.deck.pushToDeck(sc);
				stack.removeLast();
			}
			pullCardS();
		}
		return deck;
	}
	
	public int getSizeS() {
		return stack.size();
	}
	public Card topCard(){
		return stack.getLast();
	}
}
