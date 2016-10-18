package com.algorithms.integers;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class GCDTest {

	@Test
	public void test1() {
		Assert.assertEquals(6,GCD.calculate(Arrays.asList(12, 18, 30)));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(3,GCD.calculate(Arrays.asList(12, 21, 30)));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(1,GCD.calculate(Arrays.asList(23, 17, 89)));
	}

}
