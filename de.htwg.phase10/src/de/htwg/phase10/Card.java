package de.htwg.phase10;

public class Card extends MainCard{
	
	private Rank rank;
	private Color color;
	
	public Card(){
		super();
	}
	
	public enum Color {
		BLUE, RED, GREEN, YELLOW;
	}
	
	public enum Rank {
		ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,ELEVEN, TWELVE;
	}

	
	public Card(Rank rank, Color color) {
		this.rank = rank;
		this.color = color;
	}
	
	@Override 
	public String toString() {
		return ""+ rank +" "+ color;
	}

	@Override
	public Card getCard() {
		// TODO Auto-generated method stub
		return null;
	}
}