package de.htwg.se.phase10.model;

import java.util.*;

public class Archive {
	private int archnumber;
	private List<Card> archive;
	private Deck deck;
	private Stack stack;
	//test
	
	//generate a new archive
	public Archive(int number){
		archnumber = number;
		archive = new LinkedList<>();
	}
	
	//get the current Archive
	public Card[] getArchive(){
		Card[] c = new Card[archive.size()];
		for(int i = 0; i<archive.size(); i++){
			c[i] = archive.get(i);
		}
		return c;
	}
	
	// put a new Array of cards to the archive
	public void newArchive(Card [] c){

	}
	
	//put a single card to Archive
	public void putCardToArchive(Card c){
		archive.add(c);
	}
	
	//clean the Desk
	public void cleanArchive(){
		archive = null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int archnum = this.archnumber+1;
		sb.append("Archiv " + archnum +":"+ " Cards: ");
		for(Card c : archive){
			sb.append(c.getRank()).append("_").append(c.getColor());
			sb.append(", ");
		}
		return sb.toString();
	}

}
