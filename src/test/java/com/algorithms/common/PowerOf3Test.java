package com.algorithms.common;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.algorithms.common.PowerOf3Test;

public class PowerOf3Test {
	private PowerOf3 power;

	@Before
	public void setUp() throws Exception {
		this.power = new PowerOf3();
	}

	@Test
	public void test1() {
		assertEquals(true,this.power.checkByRecursion(27));
	}

	@Test
	public void test2() {
		assertEquals(false,this.power.checkByRecursion(4));
	}
	
	@Test
	public void test3() {
		assertEquals(true,this.power.checkByLooping(27));
	}

	@Test
	public void test4() {
		assertEquals(false,this.power.checkByLooping(4));
	}
	
}
