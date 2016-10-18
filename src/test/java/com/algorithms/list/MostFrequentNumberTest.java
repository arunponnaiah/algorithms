package com.algorithms.list;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class MostFrequentNumberTest {

	@Test
	public void test() {
		Assert.assertEquals(3,MostFrequentNumber.find(Arrays.asList(1,3,4,3,4,3,2,3,3,3,3,3)));
	}

}
