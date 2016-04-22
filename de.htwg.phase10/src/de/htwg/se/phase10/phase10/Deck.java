package de.htwg.se.phase10.phase10;

import java.util.*;

public class Deck {
	
	private int size = 0;
	private LinkedList<Card> cards;
	public Deck(){}
	
	/**
	 * fill the Deck with all 108 Cards
	 * and set the size to 108.
	 * @return Returns a LinkedList with all cards
	 */
	public LinkedList<Card> newDeck() {
		cards = new LinkedList<Card>();
		
		for (int i = 0; i < 2; i++) {
			for (Card.Color color: Card.Color.values()) {
				for (Card.Rank rank : Card.Rank.values()) {
					if(rank == Card.Rank.JOKER && color == Card.Color.WHITE){
						for (int k = 0; k < 4; k++){
							cards.add(new Card(rank, color, 1));
							this.size++;
						}
					}else if(rank == Card.Rank.SKIP && color == Card.Color.WHITE){
						for (int j = 0; j < 2; j++) {
							cards.add(new Card(rank, color, 1));
							this.size++;
						}
					}else if(color != Card.Color.WHITE && rank != Card.Rank.JOKER && rank != Card.Rank.SKIP){
						cards.add(new Card(rank, color, 0));
						this.size++;
					}else{
						continue;
					}
				}
			}
		}
		Collections.shuffle(cards);
		return cards;
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
	
	/*
	 * set all Cards from the Stack into the Array
	 */
	public void setStackToArray() {
		
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
