package com.algorithms.sort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class QuickSortTest {

	@Test
	public void test1() {
		assertArrayEquals(new int[]{1,2,3,4,5},QuickSort.sort(new int[]{5,4,3,2,1}));
	}
	
	@Test
	public void test2() {
		assertArrayEquals(new int[]{10,20,30,40,50},QuickSort.sort(new int[]{30,40,50,10,20}));
	}
	
}
