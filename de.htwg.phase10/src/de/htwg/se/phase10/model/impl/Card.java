package de.htwg.se.phase10.model.impl;

import javax.swing.ImageIcon;

import de.htwg.se.phase10.model.ICard;

public class Card implements ICard{
	
	private Rank rank;
	private Color color;
	private int specialC;
	private ImageIcon icon;
	
	public enum Color {
		BLUE, RED, GREEN, YELLOW, WHITE;
	}
	
	public enum Rank {
		ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,ELEVEN, TWELVE, JOKER, SKIP;
	}

	public Card(Rank rank, Color color, int s){
		this.rank = rank;
		this.color = color;
		this.specialC = s;
	}

	public Rank getRank() {
		return this.rank;
	}
	public int getRankValue(){
		switch (this.getRank()){
			case ONE:
				return 1;
			case TWO:
				return 2;
			case THREE:
				return 3;
			case FOUR:
				return 4;
			case FIVE:
				return 5;
			case SIX:
				return 6;
			case SEVEN:
				return 7;
			case EIGHT:
				return 8;
			case NINE:
				return 9;
			case TEN:
				return 10;
			case ELEVEN:
				return 11;
			case TWELVE:
				return 12;
			default:
				return 0;
		}
	}
	public Color getColor(){
		return this.color;
	}
	public int getSpecialC(){
		return this.specialC;		
	}
	public void setIcon(){
		icon = new ImageIcon(new ImageIcon("./img/" + this.getRank() + this.getColor() +".jpg").getImage().getScaledInstance(80, 100, java.awt.Image.SCALE_SMOOTH));
	}
	public ImageIcon getIcon(){
		return icon;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.rank).append(" ").append(this.color);
		return sb.toString();
	}
}