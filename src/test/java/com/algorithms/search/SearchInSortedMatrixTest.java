package com.algorithms.search;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class SearchInSortedMatrixTest {
	private SearchInSortedMatrix searchInSortedMatrix;
	private int[][] matrix;
	
	@Before
	public void setUp() throws Exception {
		this.searchInSortedMatrix = new SearchInSortedMatrix();
	}

	@Test
	public void testTrue() {
		this.matrix = new int[][]{ 
			{10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50},
          };
		Assert.assertEquals(true, this.searchInSortedMatrix.search(matrix, 29));
	}
	
	@Test
	public void testFalse() {
		this.matrix = new int[][]{ 
			{10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50},
          };
		Assert.assertEquals(false, this.searchInSortedMatrix.search(matrix, 18));
	}

}
