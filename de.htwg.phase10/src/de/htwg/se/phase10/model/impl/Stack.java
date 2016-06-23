package de.htwg.se.phase10.model.impl;

import java.util.Collections;
import java.util.LinkedList;

import de.htwg.se.phase10.model.IStack;

public class Stack implements IStack {
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
	public void removeLast(){
		stack.removeLast();
	}
	public int getSizeS() {
		return stack.size();
	}
	public Card topCard(){
		return stack.getLast();
	}
}
