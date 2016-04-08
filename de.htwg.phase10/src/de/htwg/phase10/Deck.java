package de.htwg.phase10;

import java.util.*;

public class Deck {
	
	private int size;
	private static final int DEF_CAPACITY = 108;
	private LinkedList<Card> cards;

	public Deck(){
		
	}
	
	/*
	 * fill the Deck with all 108 Cards
	 * and set the size to 108.
	 */
	public void newDeck() {
		cards = new LinkedList<Card>();
		for (Card.Color color: Card.Color.values()) {
			System.out.println(color);
			for (Card.Rank rank : Card.Rank.values()) {
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
	}
	
    public static void main(String [] args){
        Deck d = new Deck();
        System.out.println(d);
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
	
}
