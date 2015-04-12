package com.algorithms.common;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.algorithms.common.SimpleAdding;

public class SimpleAddingTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		
		SimpleAdding simpleAdding = new SimpleAdding();
		int result = simpleAdding.add(5);
		System.out.println("result >> " + result);
		assertEquals(15, result);
	}

}
