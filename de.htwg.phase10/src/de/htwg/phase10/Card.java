package de.htwg.phase10;

public class Card {

	private int zahl;
	private String Farbe;
	private String Zeichen;
	
	public Card(int zahl, String Farbe) {
		this.zahl = zahl;
		this.Farbe = Farbe;
	}
	
	public Card(int zahl, String Farbe, String Zeichen) {
		this.zahl = zahl;
		this.Zeichen = Zeichen;
		this.Farbe = Farbe;
	}
}