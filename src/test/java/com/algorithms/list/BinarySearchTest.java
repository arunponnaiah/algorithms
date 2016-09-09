package com.algorithms.list;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class BinarySearchTest {
	private BinarySearch binarySearch;
	
	@Before
	public void setUp() throws Exception {
		this.binarySearch = new BinarySearch();
	}

	@Test
	public void testTrue1() {
		int[] inputs = new int[]{1,3,10,0,30,2,5,100};
		Assert.assertEquals(true, this.binarySearch.isExist(inputs, 3));
	}
	
	@Test
	public void testTrue2() {
		int[] inputs = new int[]{1,3,10,0,30,2,5,100};
		Assert.assertEquals(true, this.binarySearch.isExist(inputs, 100));
	}
	
	@Test
	public void testFalse1() {
		int[] inputs = new int[]{1,3,10,0,30,2,5,100};
		Assert.assertEquals(false, this.binarySearch.isExist(inputs, 99));
	}
	
	@Test
	public void testFalse2() {
		int[] inputs = new int[]{1,3,10,0,30,2,5,100};
		Assert.assertEquals(false, this.binarySearch.isExist(inputs, 4));
	}

}
