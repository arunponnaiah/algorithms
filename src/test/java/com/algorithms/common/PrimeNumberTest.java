package com.algorithms.common;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.algorithms.common.PrimeNumber;

public class PrimeNumberTest {
	private PrimeNumber primeNumber;
	
	@Before
	public void setUp() throws Exception {
		this.primeNumber = new PrimeNumber();
	}

	@Test
	public void testIsPrime() {
		assertTrue(this.primeNumber.isPrime(15));
		assertFalse(this.primeNumber.isPrime(17));
	}

}
