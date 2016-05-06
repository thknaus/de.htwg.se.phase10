package de.htwg.se.phase10.phase10;

public class Stack {
	private int size;
	
	public Stack() {
		new Stack();
	}

	public void pullCardS() {
		size--;
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
