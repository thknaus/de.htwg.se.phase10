package de.htwg.se.phase10.model;

import java.util.*;

public class Archive {
	private int archnumber;
	private List<Card> archive;
	private Deck deck;
	private Stack stack;
	
	//generate a new archive
	public Archive(int number){
		archnumber = number;
		archive = new LinkedList<>();
	}
	
	//get the current Archive
	public Card[] getArchive(){
		Card[] c = new Card[archive.size()];
		return c;
	}
	
	// put a new Array of cards to the archive
	public void newArchive(Card [] c){

	}
	
	//put a single card to Archive
	public boolean putCardToArchive(Card c){

		return false;
	}
	
	//clean the Desk
	public void cleanArchive(){
		archive = null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Archiv: " + this.archnumber + "Cards: ");
		for(Card c : archive){
			sb.append(c.getRank()).append(c.getColor()).append(c.getSpecialC());
			sb.append(" ");
		}
		return sb.toString();
	}

}
