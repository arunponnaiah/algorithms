package com.algorithms.list;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class FindSmallestElementUnSortedArrayTest {
	private FindSmallestElementUnSortedArray findSmallestElementUnSortedArray;
	
	@Before
	public void setUp() throws Exception {
		this.findSmallestElementUnSortedArray = new FindSmallestElementUnSortedArray();
	}

	@Test
	public void test1() {
		Assert.assertEquals(4,this.findSmallestElementUnSortedArray.find(new int[]{11,100,9,4}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(10,this.findSmallestElementUnSortedArray.find(new int[]{130,100,18,10}));
	}

}
