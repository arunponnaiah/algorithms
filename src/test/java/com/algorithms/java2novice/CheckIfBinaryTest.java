package com.algorithms.java2novice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckIfBinaryTest {
	private CheckIfBinary checkIfBinary;

	@Before
	public void setUp() throws Exception {
		this.checkIfBinary = new CheckIfBinary();
	}

	@Test
	public void test() {
		assertTrue(this.checkIfBinary.isBinary(1101));
	}

}
