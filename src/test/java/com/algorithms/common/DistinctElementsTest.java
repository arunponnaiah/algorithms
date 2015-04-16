package com.algorithms.common;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DistinctElementsTest {
	private DistinctElements distinctElements;

	@Before
	public void setUp() throws Exception {
		this.distinctElements = new DistinctElements();
	}

	@Test
	public void testFind() {
		assertArrayEquals(new int[]{2,3,4,5,8,9},this.distinctElements.find(new int[]{9,8,5,2,3,2,4,5}));
	}

}
