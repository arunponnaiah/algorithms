package com.algorithms.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.algorithms.common.Fibonacci;

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
	public void testGenerate(){
		List<Integer> expecteds = new ArrayList<Integer>(Arrays.asList(0,1,1,2,3,5,8,13,21,34));
		List<Integer> actuals = this.fibonacci.generate(10);
		Assert.assertEquals(expecteds, actuals);
	}

}
