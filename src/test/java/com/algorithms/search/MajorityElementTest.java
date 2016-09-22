package com.algorithms.search;

import org.junit.Test;

import junit.framework.Assert;

public class MajorityElementTest {

	@Test
	public void testMajorityElement() {
		Assert.assertEquals(9, MajorityElement.search(new int[]{2,9,3,6,9,9,9,9,5,9}));
	}


	@Test
	public void testNotMajorityElement() {
		Assert.assertEquals(-1, MajorityElement.search(new int[]{2,2,3,6,9,9,9,9,5,9}));
	}
}
