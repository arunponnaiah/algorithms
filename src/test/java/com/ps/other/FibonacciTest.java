package com.ps.other;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ps.other.Fibonacci;

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
		int[] expecteds ={0,1,1,2,3,5,8,13,21,34};
		int[] actuals = this.fibonacci.generate(10);
		Assert.assertArrayEquals(expecteds, actuals);
	}

}
