package de.htwg.phase10;

public class Card {
	
	private Rank rank;
	private Color color;
	
	
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
	
	public Color getColor() {
		return color;
	}
	
	public Rank getRank() { 
		return rank;
	}

	@Override 
	public String toString() {
		return ""+ rank +" "+ color;
	}
	
	
	/**
	 *zum Testen. 
	 **/
    public static void main(String [] args){
        Card c1 = new Card(Rank.TWO, Color.BLUE);
        Card c2 = new Card(Rank.FOUR,Color.RED);
        Card c3 = new Card(Rank.FIVE,Color.YELLOW);
        Card c4 = new Card(Rank.TWELVE,Color.GREEN);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }

	
	/*
	private int zahl;
	private String Farbe;
	private String Zeichen;
	*/
	
	/*
	public Card(int zahl, String Farbe) {
		this.zahl = zahl;
		this.Farbe = Farbe;
	}
	
	public Card(int zahl, String Farbe, String Zeichen) {
		this.zahl = zahl;
		this.Zeichen = Zeichen;
		this.Farbe = Farbe;
	}
	*/
	
}