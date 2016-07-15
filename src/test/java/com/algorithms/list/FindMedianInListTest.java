package com.algorithms.list;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class FindMedianInListTest {
	private  FindMedianInList findMedianInList;
	
	@Before
	public void setUp() throws Exception {
		this.findMedianInList = new FindMedianInList();
	}

//	@Test
//	public void test1() {
//		Assert.assertEquals(2, this.findMedianInList.get(new ArrayList<Integer>(Arrays.asList(1, 2, 5))));
//	}
	
	@Test
	public void test2() {
		Assert.assertEquals(6.5, this.findMedianInList.get(new ArrayList<Integer>(Arrays.asList(2, 6, 7, 8))));
	}

}
