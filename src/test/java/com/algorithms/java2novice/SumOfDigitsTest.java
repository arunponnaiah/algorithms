package com.algorithms.java2novice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SumOfDigitsTest {
	private SumOfDigits sumOfDigits;
	
	@Before
	public void setUp() throws Exception {
		this.sumOfDigits = new SumOfDigits();
	}

	@Test
	public void test() {
		assertEquals(10, this.sumOfDigits.execute(253));
	}

}
