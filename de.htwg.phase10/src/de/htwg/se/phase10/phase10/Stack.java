package de.htwg.se.phase10.phase10;

import java.util.LinkedList;

public class Stack {
	private int size;
	private LinkedList<Card> stack = new LinkedList<Card>();
	
	public Stack() {
		new Stack();
	}

	public Card pullCardS() {
		Card c = stack.getLast();
		stack.removeLast();
		size--;
		return c;
	}

	
	public void dropCardS() {
		size++;
		
	}
	
	public void backtoDeckS() {
		
		size = 0;
	}
	
	public int getsizeS() {
		return size;
	}
	
}
