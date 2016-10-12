package com.algorithms.common;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class BracesMatchTest {
	private BracesMatch bracesMatch;
	
	@Before
	public void setUp() throws Exception {
		this.bracesMatch = new BracesMatch();
	}

	@Test
	public void testTrue() {
		Assert.assertEquals(true,this.bracesMatch.isBalanced("({})"));
	}
	
	@Test
	public void testFalse() {
		Assert.assertEquals(false,this.bracesMatch.isBalanced("[(])"));
	}

}
