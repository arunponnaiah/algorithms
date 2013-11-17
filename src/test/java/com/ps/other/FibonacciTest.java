package com.ps.other;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
	private Fibonacci fibonacci;
	@Before
	public void setUp() throws Exception {
		this.fibonacci = new Fibonacci();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGenerate() {
		this.fibonacci.generate(10);
	}

}
