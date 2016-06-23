package de.htwg.se.phase10.model;

import de.htwg.se.phase10.model.impl.Card;
import de.htwg.se.phase10.model.impl.Stack;

public interface IPlayerHand {
	String getName();
	int getScore();
	Card[] getHand();
	Card pushCardH(Card c);
	Card dropCardH(Card c);
	Card getCardStack(Stack s);
	void setCardHand(Card c);
	boolean containsCard(Card c);
	int getSizeH();
	String getCurrentPhase();
	void setPhase(String p);
}
