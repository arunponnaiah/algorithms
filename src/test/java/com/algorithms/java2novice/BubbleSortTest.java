package com.algorithms.java2novice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {
	private BubbleSort bubbleSort;
	@Before
	public void setUp() throws Exception {
		this.bubbleSort = new BubbleSort();
	}

	@Test
	public void test() {
		assertArrayEquals(new int[]{1,2,3,4}, this.bubbleSort.sort(new int[]{4,3,2,1}));
	}

}
