package de.htwg.se.phase10.phase10;

import java.util.*;

public class Deck {
	
	//public static Object getNewCard;
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
			cards.add(new Card(rank, color, 1));
			this.size++;
		}
	}
	
	private void newDeckSpCS(Card.Rank rank,Card.Color color) {
		for (int j = 0; j < 2; j++) {
			cards.add(new Card(rank, color, 1));
			this.size++;
		}
	}
	
	private void newDeckSpCJ(Card.Rank rank,Card.Color color) {
		cards.add(new Card(rank, color, 0));
		this.size++;
	}

	/*
	 * clean the Array completely and set the
	 * size to zero.
	 * Return: returns true if deck has been cleaned.
	 */
	public boolean cleanDeck() {
		this.cards.clear();
		this.size = 0;
		return true;
	}
	
	/*
	 * get a random Card from the list, delete it and
	 * reduce the size around one.
	 */
	public Card getNewCard() {
		Card c = cards.getLast();
		cards.removeLast();
		size--;
		return c;
	}
	public void backtoDeckD() {
		
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(cards != null){
			for(Card s : cards){
				sb.append(s.getRank()).append("_").append(s.getColor()).append(", \n");
			}
		}
		sb.append("size: " + this.size);
		return sb.toString();
	}
}
