package de.htwg.se.phase10.testStack;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import de.htwg.se.phase10.phase10.*;

public class TestStack extends TestCase{
	private Stack firstStack;
	
	@Before
	public void setUp(){
		firstStack = new Stack();
		System.out.println(firstStack);
	}

	/*
	@Test
	public void dropCardS(){
		assertEquals(10, hand.getSize());
	}
	
	@Test
	public void pullCardS(){
		assertEquals(10, hand.getSize());
	}
	
	@Test
	public void backtoDeckS(){
		assertEquals(10, hand.getSize());
	}
	
	@Test
	public void getSizeS(){
		assertEquals(10, hand.getSize());
	}
	*/
}