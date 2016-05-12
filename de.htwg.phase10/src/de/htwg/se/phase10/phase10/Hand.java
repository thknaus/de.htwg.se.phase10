package de.htwg.se.phase10.phase10;

import java.util.*;

public class Hand {

	private int size;
	private Card [] handcards = new Card[10];
	private Deck deck;
	
	public Hand (Deck d) {
		deck = d;
		for(int i = 0; i < 10; i++){
			Card c = deck.getNewCard();
			handcards[i] = c;
			size++;
		}
	}
	

	public void getNewCardH() {
		if (size >= 10){
			System.out.println("Es darf keine Karte mehr aufgenommen werdne");			
		}
		else {
			Card c = deck.getNewCard();
			handcards[size +1] = c;
			size++;
		}
	}
	
	public int getSizeH(){
		return this.size;
	}
	
	public Card dropCardH(Card c) {
		for (int i = 0; i < size; i++) {
			if(handcards[i].equals(c)){
				handcards[i] = null;
				size--;
			}
			else {
				System.out.println("Karte befindet sich nicht auf Ihrer Hand");
			}
		}
		return c;
	}
	
	public void pullCardH(Card c) {
		if (size >= 10){
			System.out.println("Es darf keine Karte mehr aufgenommen werdne");			
		}
		else {
			/*
			Card p = stack.pullCardS();
			handcards[size +1] = p;
			size++;
			*/
		}
	}

	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(handcards != null){
			for(Card c : handcards){
				sb.append(c.getRank()).append("_").append(c.getColor()).append(", \n");
			}
		}
		sb.append("size: " + this.size);
		return sb.toString();
	}
	
}
