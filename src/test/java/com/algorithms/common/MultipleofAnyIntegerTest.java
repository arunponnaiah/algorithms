package com.algorithms.common;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.algorithms.common.MultipleofAnyInteger;

public class MultipleofAnyIntegerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPrint() {
		MultipleofAnyInteger multipleofAnyInteger = new MultipleofAnyInteger();
		multipleofAnyInteger.print(1,100,6);
	}
}
