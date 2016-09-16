package com.algorithms.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class QuickSortTest {
	private QuickSort quickSort;
	
	@Before
	public void setUp() throws Exception {
		this.quickSort = new QuickSort();
	}

	@Test
	public void test1() {
		//assertArrayEquals(new int[]{1,2,3,4,5},this.quickSort.sortNumbers(new int[]{5,4,3,2,1}));
	}
	
	@Test
	public void test2() {
		assertArrayEquals(new int[]{10,20,30,40,50},this.quickSort.sortNumbers(new int[]{30,40,50,10,20}));
	}
	
}
