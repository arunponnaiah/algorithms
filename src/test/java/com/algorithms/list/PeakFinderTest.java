package com.algorithms.list;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class PeakFinderTest {
private PeakFinder peakFinder;

	@Before
	public void setUp() throws Exception {
		this.peakFinder = new PeakFinder();
	}

	@Test
	public void test1() {
		Assert.assertEquals(100,this.peakFinder.find(new int[]{100,3,10,29,30,2,5,1}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(100,this.peakFinder.find(new int[]{1,3,10,0,30,2,5,100}));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(100,this.peakFinder.find(new int[]{3,10,100,30,2,5,1}));
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(10,this.peakFinder.find(new int[]{1,3,10,0,100,30,2,1}));
	}


}
