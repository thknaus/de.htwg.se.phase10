package de.htwg.se.phase10.model.impl;

import java.util.*;


public class Archive {
	private int archnumber;
	private List<Card> arch;

	public Archive(int number){
		archnumber = number;
		arch = new LinkedList<>();
	}
	
	public Card[] getArchive(){
		Card[] c = new Card[arch.size()];
		for(int i = 0; i<arch.size(); i++){
			c[i] = arch.get(i);
		}
		return c;
	}
	
	public void putCardToArchive(Card c){
		arch.add(c);
	}
	
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
