package de.htwg.se.phase10.model;

import de.htwg.se.phase10.model.impl.Card;

public interface IDeck {
	void newDeck();
	boolean cleanDeck();
	Card getNewCard();
	boolean pushToDeck(Card s);
	int getSize();
	
}
