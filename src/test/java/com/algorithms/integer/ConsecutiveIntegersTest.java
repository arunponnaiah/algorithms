package com.algorithms.integer;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.algorithms.list.ConsecutiveIntegers;

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
		Set<Integer> expected = new HashSet<Integer>();
		expected.add(5);
		
		Assert.assertEquals(expected,consecutiveIntegers.find(arr));
	}

}
