package com.algorithms.list;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindPairSumToValueTest {
	private FindPairSumToValue findPairSumToValue;
	
	@Before
	public void setUp() throws Exception {
		this.findPairSumToValue = new FindPairSumToValue();
	}

	@Test
	public void testSumEqualsZero() {
		List<int[]> expects = new ArrayList<int[]>();
		expects.add(new int[]{2,-2});
		expects.add(new int[]{-1,1});
		Assert.assertArrayEquals(expects.toArray(), 
				this.findPairSumToValue.findPairs(new int[]{1, -2, 7, -5, 2, -1}, 0).toArray());
	}

}
