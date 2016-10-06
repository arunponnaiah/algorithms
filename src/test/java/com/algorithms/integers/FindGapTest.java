package com.algorithms.integers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindGapTest {
	private FindGap findgap;
	@Before
	public void setUp() throws Exception {
		this.findgap = new FindGap();
	}

	@Test
	public void test() {
		String expectedOutput = "0-2, 7-49, 52, 54-75, 77-99";
		Assert.assertEquals(expectedOutput, this.findgap.summarizeGaps(new int[]{3, 4, 5, 6, 50, 51, 53, 76}));
		
	}

}
