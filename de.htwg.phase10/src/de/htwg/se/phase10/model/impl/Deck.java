package de.htwg.se.phase10.model.impl;

import java.util.*;

import de.htwg.se.phase10.model.IDeck;

public class Deck implements IDeck{
	
	private int size = 0;
	private LinkedList<Card> cards = new LinkedList<Card>();
	public Deck(){
		 newDeck();
	}
	
	/**
	 * fill the Deck with all 108 Cards
	 * and set the size to 108.
	 * @return Returns a LinkedList with all cards
	 */
	@Override
	public void newDeck() {
		for (int i = 0; i < 2; i++) {
			forCardColor();
		}
		Collections.shuffle(cards);
	}
	
	private void forCardColor() {
		for (Card.Color color: Card.Color.values()) {
			forCardRank(color);
		}
	}
	
	private void forCardRank(Card.Color color) {
		for (Card.Rank rank : Card.Rank.values()) {
			whichCard(rank, color);
		}
	}
	
	private void whichCard(Card.Rank rank,Card.Color color) {
		if(rank == Card.Rank.JOKER && color == Card.Color.WHITE){
			newDeckNC(rank, color);

		}else if(rank == Card.Rank.SKIP && color == Card.Color.WHITE){
			newDeckSpCS(rank, color);

		}else if(color != Card.Color.WHITE && rank != Card.Rank.JOKER && rank != Card.Rank.SKIP){
			newDeckSpCJ(rank, color);
		}
	}
	
	private void newDeckNC(Card.Rank rank,Card.Color color) {
		for (int k = 0; k < 4; k++){
			Card c = new Card(rank, color, 1);
			cards.add(c);
			c.setIcon();
			this.size++;
		}
	}
	
	private void newDeckSpCS(Card.Rank rank,Card.Color color) {
		for (int j = 0; j < 2; j++) {
			Card c = new Card(rank, color, 1);
			cards.add(c);
			c.setIcon();
			this.size++;
		}
	}
	
	private void newDeckSpCJ(Card.Rank rank,Card.Color color) {
		Card c = new Card(rank, color, 0);
		cards.add(c);
		c.setIcon();
		this.size++;
	}

	@Override
	public boolean cleanDeck() {
		this.cards.clear();
		this.size = 0;
		return true;
	}
	
	@Override
	public Card getNewCard() {
		Card c = cards.getLast();
		cards.removeLast();
		size--;
		return c;
	}
	@Override
	public boolean pushToDeck(Card s) {
		if(cards.size() == 108){
			return false;
		}
		cards.add(s);
		Collections.shuffle(cards);
		size++;
		return true;
	}
	@Override
	public int getSize(){
		return this.size;
	}
}
