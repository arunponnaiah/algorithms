package com.ps.coderbyte;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ps.coderbyte.SimpleAdding;

public class SimpleAddingTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		
		SimpleAdding simpleAdding = new SimpleAdding();
		int result = simpleAdding.add(5);
		assertEquals(15, result);
	}

}
