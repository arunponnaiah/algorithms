package com.ps.other;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPrint() {
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.generate(10);
		
	}

}
