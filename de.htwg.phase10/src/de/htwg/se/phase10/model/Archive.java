package de.htwg.se.phase10.model;

import java.util.*;

public class Archive {
	private Card [] archive;
	private Deck deck;
	private Stack stack;
	
	//generate a new archive
	public Archive(int size) {
		archive = new Card[size];
	}
	
	//get the current Archive
	public Card[] getArchive(){
		return archive;
	}
	
	// put a new Array of cards to the archive
	public void newArchive(Card [] c){
		for(int i = 0; i < archive.length; i++){
			archive[i] = c[i];
		}
	}
	
	//put a single card to Archive
	public boolean putCardToArchive(Card c){
		for(int i = 0; i < 10; i++){
			if(archive[i] == null){
				archive[i] = c;
				return true;
			}
		}
		return false;
	}
	
	//clean the Desk
	public void cleanArchive(){
		archive = null;
	}
}
