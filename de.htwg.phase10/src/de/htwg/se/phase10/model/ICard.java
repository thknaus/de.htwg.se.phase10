package de.htwg.se.phase10.model;

import de.htwg.se.phase10.model.impl.Card;
import de.htwg.se.phase10.model.impl.Card.Color;
import de.htwg.se.phase10.model.impl.Card.Rank;

public interface ICard {
	Rank getRank();
	int getRankValue(Card c);
	Color getColor();
	int getSpecialC();
	
}
