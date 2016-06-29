package de.htwg.se.phase10.model.impl;

import java.util.LinkedList;

import de.htwg.se.phase10.model.IStack;

public class Stack implements IStack {
	private LinkedList<Card> stackL;
	private Deck deck;
	public Stack() {
		stackL = new LinkedList<Card>();
	}
	@Override
	public Card pullCardS() {
		if(stackL.isEmpty()){
			return null;
		}
		Card c = stackL.getLast();
		stackL.removeLast();
		return c;
	}

	@Override	
	public void pushCardS(Card c) {
		stackL.add(c);
	}
	@Override
	public Deck backToDeckS(Deck d) {
		this.deck = d;
		if (!stackL.isEmpty()) {
			for(Card sc : stackL){
				this.deck.pushToDeck(sc);
				stackL.removeLast();
			}
			pullCardS();
		}
		return deck;
	}
	@Override
	public void removeLast(){
		stackL.removeLast();
	}
	@Override
	public int getSizeS() {
		return stackL.size();
	}
	public Card topCard(){
		if(stackL.isEmpty()){
			return null;
		}
		return stackL.getLast();
	}
}
