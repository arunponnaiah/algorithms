package com.algorithms.java2novice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrimeNumberTest {
	private PrimeNumber primeNumber;
	
	@Before
	public void setUp() throws Exception {
		this.primeNumber = new PrimeNumber();
	}

	@Test
	public void testCheck() {
		assertTrue(this.primeNumber.check(6));
	}

}
