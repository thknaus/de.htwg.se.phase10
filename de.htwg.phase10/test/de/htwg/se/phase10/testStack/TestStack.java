package de.htwg.se.phase10.testStack;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import de.htwg.se.phase10.phase10.*;

public class TestStack extends TestCase{
	private Stack firstStack;
	private int size;
	
	@Before
	public void setUp(){

		firstStack = new Stack();
		System.out.println(firstStack);
	}

	/*
	@Test
	public void testdropCardS(){
		assertEquals(stack.getlast(), );
	}
	
	@Test
	size = n - 1;
	public void testpullCardS(){
		assertEquals(n, stack.getsize());
	}
	
	@Test
	public void testbacktoDeckS(){
		assertEquals(1, stack.getSize());
	}
	
	@Test
	public void testgetSizeS(){
		assertNotNull(stack.size());
	}
	*/
}