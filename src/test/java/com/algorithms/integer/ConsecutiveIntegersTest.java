package com.algorithms.integer;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class ConsecutiveIntegersTest {

	private ConsecutiveIntegers consecutiveIntegers;
	
	@Before
	public void setup(){
		consecutiveIntegers = new ConsecutiveIntegers();
	}
	
	@Test
	public void test5() {
		int[] arr = {1,2,2,3,3,4,4,5,5,5};
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(5);
		
		Assert.assertEquals(expected,consecutiveIntegers.find(arr));
	}

}
