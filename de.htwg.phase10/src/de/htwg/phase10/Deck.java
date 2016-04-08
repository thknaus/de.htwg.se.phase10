package de.htwg.phase10;

import java.util.*;

public class Deck {
	
	private int size;
	private static final int DEF_CAPACITY = 108;
	private LinkedList<Card> cards;

	public Deck(){}
	
	/**
	 * fill the Deck with all 108 Cards
	 * and set the size to 108.
	 * @return Returns a LinkedList with all cards
	 */
	public LinkedList<Card> newDeck() {
		cards = new LinkedList<Card>();
		for (Card.Color color: Card.Color.values()) {
			for (Card.Rank rank : Card.Rank.values()) {
				for(SpecialCard.SpecialRank sc : SpecialCard.SpecialRank.values()){
					cards.add(new Card(sc, SpecialCard.SpecialColor.WHITE));
				}
				cards.add(new Card(rank, color));
				this.size++;
			}
		}
		

		/*
		System.out.println(cards);
		
		for (SpecialCard.SpecialColor color: SpecialCard.SpecialColor.values()) {
			for (SpecialCard.SpecialRank rank : SpecialCard.SpecialRank.values()) {
				cards.add(new SpecialCard(rank, color));
			}
		}
		*/
		return cards;
	}

	/*
	 * clean the Array completely and set the
	 * size to zero.
	 */
	public void cleanDeck() {
		
	}
	
	/*
	 * get a random Card from the Array, delete it and
	 * reduced the size around one.
	 */
	public void getnewCard() {
		
	}
	
	/*
	 * set all Cards from the Stack into the Array
	 */
	public void setStackToArray() {
		
	}
	
	@Override
	public String toString() {
		return "Deck [size=" + size + ", cards=" + cards + "]";
	}
}
