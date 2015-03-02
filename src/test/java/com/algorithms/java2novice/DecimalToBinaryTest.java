package com.algorithms.java2novice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalToBinaryTest {
	private DecimalToBinary decimalToBinary;
	@Before
	public void setUp() throws Exception {
		this.decimalToBinary = new DecimalToBinary();
	}

	@Test
	public void testToBinary() {
		assertEquals("1110",this.decimalToBinary.toBinary(14));
	}

}
