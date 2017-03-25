package com.algorithms.common;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.algorithms.common.CheckPowerOf3;

public class CheckIsPowerOf3 {
	private CheckPowerOf3 power;

	@Before
	public void setUp() throws Exception {
		this.power = new CheckPowerOf3();
	}

	@Test
	public void testCheck27() {
		assertEquals(true,this.power.check(27));
	}

	@Test
	public void testCheck4() {
		assertEquals(false,this.power.check(4));
	}
	
	@Test
	public void testCheck81() {
		assertEquals(true,this.power.check(81));
	}
}
