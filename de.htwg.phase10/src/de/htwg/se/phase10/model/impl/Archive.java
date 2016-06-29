package de.htwg.se.phase10.model.impl;

import java.util.*;


public class Archive {
	private int archnumber;
	private List<Card> arch;
	//private Deck deck;
	//private Stack stack;

	//private GamePhase phase;
	
	//generate a new archive
	public Archive(int number){
		archnumber = number;
		arch = new LinkedList<>();
	}
	
	//get the current Archive
	public Card[] getArchive(){
		Card[] c = new Card[arch.size()];
		for(int i = 0; i<arch.size(); i++){
			c[i] = arch.get(i);
		}
		return c;
	}
	
	//put a single card to Archive
	public void putCardToArchive(Card c){
		arch.add(c);
	}
	
	//clean the Desk
	public void cleanArchive(){
		arch = new LinkedList<>();
	}
	public Card get(int i) {
		return arch.get(i);
	}

	public int size() {
		return arch.size();
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int archnum = this.archnumber;
		sb.append("Archive " + archnum +":"+ " Cards: ");
		for(Card c : arch){
			sb.append(c.getRank()).append("_").append(c.getColor());
			sb.append(", ");
		}
		return sb.toString();
	}
}
