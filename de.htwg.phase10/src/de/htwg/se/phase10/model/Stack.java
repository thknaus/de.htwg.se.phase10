package de.htwg.se.phase10.model;

import java.util.LinkedList;

public class Stack {
	private int size;
	private LinkedList<Card> stack;
	private Deck deck;
	public Stack() {
		stack = new LinkedList<Card>();
	}

	public Card pullCardS() {
		if(size == 0){
			return null;
		}
		Card c = stack.getLast();
		stack.removeLast();
		size--;
		return c;
	}

	
	public void pushCardS(Card c) {
		stack.add(c);
		size++;
	}
	
	public void backToDeckS() {
		if (size > 1) {
			Card c = stack.getLast();
			stack.removeLast();
			for(Card sc : stack){
				this.deck.pushToDeck(sc);
			}
			pushCardS(c);
			size = 1;
		}
	}
	
	public int getSizeS() {
		return size;
	}
}
