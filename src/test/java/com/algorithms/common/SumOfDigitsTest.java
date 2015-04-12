package com.algorithms.common;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.algorithms.common.SumOfDigits;

public class SumOfDigitsTest {
	private SumOfDigits sumOfDigits;
	
	@Before
	public void setUp() throws Exception {
		this.sumOfDigits = new SumOfDigits();
	}

	@Test
	public void testExecute() {
		assertEquals(10, this.sumOfDigits.execute(253));
	}

}
