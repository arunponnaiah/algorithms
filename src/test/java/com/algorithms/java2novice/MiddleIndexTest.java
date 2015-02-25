package com.ps.java2novice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MiddleIndexTest {
	private MiddleIndex middleIndex;
	
	@Before
	public void setUp() throws Exception {
		this.middleIndex = new MiddleIndex();
	}

	@Test
	public void testFind() {
		int[] input = new int[]{0,6,2,2,2};
		assertEquals(1, this.middleIndex.find(input));
	}

}
