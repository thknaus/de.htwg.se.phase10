package de.htwg.se.phase10.model;

import java.util.List;

import de.htwg.se.phase10.model.impl.Card;

public interface IArchive {
	/**
	 * 
	 * @return the current Archive with all Cards
	 */
	Card[] getArchive();
	/**
	 * @param c = Array of Cards for a new Archive
	 */
	void newArchive(Card [] c);
	/**
	 * @param puts card c to archive
	 */
	void putCardToArchive(Card c);
	
	/**
	 * deletes the current archive
	 */
	void cleanArchive();
	
	/**
	 * @param i = index of the card
	 * @return returns the card at index i
	 */
	Card get(int i);
	/**
	 * @return the size of the archive
	 */
	int size();
}
