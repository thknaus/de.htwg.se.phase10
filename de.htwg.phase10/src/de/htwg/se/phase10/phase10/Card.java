package de.htwg.se.phase10.phase10;

public class Card {
	
	private Rank rank;
	private Color color;
	private int specialC;
	public Card(){}
	
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
	public Color getColor(){
		return this.color;
	}
}