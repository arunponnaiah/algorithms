package com.algorithms.other;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PowerTest {
	private Power power;

	@Before
	public void setUp() throws Exception {
		this.power = new Power();
	}

	@Test
	public void testCalc() {
		assertEquals(8,this.power.calc(2,3));
	}

	@Test
	public void testCalcByRecursion() {
		assertEquals(8,this.power.calcByRecursion(2,3));
	}

}
