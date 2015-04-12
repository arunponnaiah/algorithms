package com.algorithms.common;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.algorithms.common.CheckIfBinary;

public class CheckIfBinaryTest {
	private CheckIfBinary checkIfBinary;

	@Before
	public void setUp() throws Exception {
		this.checkIfBinary = new CheckIfBinary();
	}

	@Test
	public void testTrue() {
		assertTrue(this.checkIfBinary.isBinary(110));
	}
	
	@Test
	public void testFalse() {
		assertFalse(this.checkIfBinary.isBinary(1005));
	}

}
