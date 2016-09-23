package com.algorithms.sort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.algorithms.sort.InsertionSort;

public class InsertionSortTest {
	private InsertionSort insertionSort;
	@Before
	public void setUp() throws Exception {
		this.insertionSort = new InsertionSort();
	}

	@Test
	public void testSort() {
		assertArrayEquals(new int[]{0,1,3,4,5},this.insertionSort.sort(new int[]{5,4,3,0,1}));
	}

}
