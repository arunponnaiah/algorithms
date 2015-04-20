package com.algorithms.common;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringToIntegerTest {
	private StringToInteger stringToInteger;
	@Before
	public void setUp() throws Exception {
		this.stringToInteger = new StringToInteger();
	}

	@Test
	public void testConvert() {
		assertEquals(12345,this.stringToInteger.convert("12345"));
	}

}
