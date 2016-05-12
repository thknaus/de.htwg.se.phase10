package de.htwg.se.phase10.phase10;

import java.util.LinkedList;

public class Stack {
	private int size;
	private LinkedList<Card> stack = new LinkedList<Card>();
	private Deck deck;
	public Stack() {
		//Deck deck = this.deck;
		new Stack();
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
		Card c = stack.getLast();
		stack.removeLast();
		for(Card sc : stack){
			this.deck.pushToDeck(sc);
		}
		pushCardS(c);
		size = 1;
	}
	
	public int getSizeS() {
		return size;
	}
	
}
