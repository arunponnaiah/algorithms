package com.algorithms.integers;

import org.junit.Test;

import junit.framework.Assert;

/**
 * Test cases to test the algorithm to sum two integers with out arithmetic operator (+).
 * @author aponnaia
 *
 */
public class SumOfTwoNumbersTest {
	

	@Test
	public void test1() {
		Assert.assertEquals(5, SumOfTwoNumbers.sum(2, 3));
	}
	
	
	@Test
	public void test2() {
		Assert.assertEquals(-7, SumOfTwoNumbers.sum(-2, -5));
	}
	

}
