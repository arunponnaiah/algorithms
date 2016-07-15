package com.algorithms.list;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class AtleastOneTest {
	private AtleastOne atleastOne;

	@Before
	public void setUp() throws Exception {
		this.atleastOne = new AtleastOne();
	}

	@Test
	public void test() {
		int[] intArr = {3,4,5,3,4};
		Assert.assertEquals(5,this.atleastOne.find(intArr));
	}

}
