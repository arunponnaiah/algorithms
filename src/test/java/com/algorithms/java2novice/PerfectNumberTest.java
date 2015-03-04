package com.algorithms.java2novice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PerfectNumberTest {
	private PerfectNumber perfectNumber;
	@Before
	public void setUp() throws Exception {
		this.perfectNumber = new PerfectNumber();
	}

	@Test
	public void test() {
		assertTrue(this.perfectNumber.isPerfectNumber(6));
		assertFalse(this.perfectNumber.isPerfectNumber(11));
	}

}
