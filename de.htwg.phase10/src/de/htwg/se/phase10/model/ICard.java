package de.htwg.se.phase10.model;

import javax.swing.ImageIcon;

import de.htwg.se.phase10.model.impl.Card.Color;
import de.htwg.se.phase10.model.impl.Card.Rank;

public interface ICard {
	Rank getRank();
	int getRankValue();
	Color getColor();
	int getSpecialC();
	void setIcon();
	ImageIcon getIcon();
	
}
