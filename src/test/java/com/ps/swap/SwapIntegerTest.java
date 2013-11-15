package com.algorithm.swap;


import org.junit.Before;
import org.junit.Test;

public class SwapIntegerTest{
	private int x,y;
	
	@Before
	public void setUp() throws Exception {
		x=1;
		y=10;
	}

	@Test
	public void testSwap(){
		if (x != y) {
	         x ^= y;
	         y ^= x;
	         x ^= y;
	     }
		 System.out.println("x : " + x + " ; y : "+y);
	}
}
