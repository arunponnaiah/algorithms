package com.algorithms.list;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class FindMaxTest {
	private FindMaxInList findMax;
	
	@Before
	public void setup(){
		this.findMax = new FindMaxInList();
	}
	
	@Test
	public void test() {	
		Assert.assertEquals(10, this.findMax.get(new ArrayList<Integer>(Arrays.asList(0, 1, 10, 2, 3))));
	}
}
