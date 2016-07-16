package de.htwg.se.phase10.model;

import de.htwg.se.phase10.model.impl.Card;
import de.htwg.se.phase10.model.impl.Deck;

public interface IStack {
	Card pullCardS();
	void pushCardS(Card c);
	Deck backToDeckS(Deck d);
	void removeLast();
	int getSizeS();
	Card topCard();
	
}
