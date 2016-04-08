package de.htwg.phase10;

public class SpecialCard {
	
	private SpecialRank rank;
	private SpecialColor color;
	
	
	public enum SpecialColor {
		WHITE;
	}
	
	public enum SpecialRank {
		JOKER1, JOKER2, JOKER3, JOKER4, JOKER5, JOKER6, JOKER7, JOKER8, SKIP1, SKIP2, SKIP3, SKIP4;
	}

	public SpecialCard(SpecialRank rank, SpecialColor color) {
		this.rank = rank;
		this.color = color;
	}
	
	public SpecialColor getColor() {
		return color;
	}
	
	public SpecialRank getRank() { 
		return rank;
	}

	@Override 
	public String toString() {
		return ""+ rank +" "+ color;
	}
}