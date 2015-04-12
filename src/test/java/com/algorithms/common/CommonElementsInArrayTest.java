package com.algorithms.common;

import java.util.Arrays;
import java.util.HashSet;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.algorithms.common.CommonElementsInArray;

public class CommonElementsInArrayTest {
	private CommonElementsInArray commonElementsInArray;
	private int[] firstArray;
	private int[] secondArray;
	
	
	@Before
	public void setUp() throws Exception {
		this.firstArray= new int[]{1,2,3,10,20};
		this.secondArray= new int[]{5,4,3,10};
		this.commonElementsInArray = new CommonElementsInArray(firstArray,secondArray);
	}

	@Test
	public void testFind() {
		Assert.assertEquals(new HashSet<Integer>(Arrays.asList(3,10)), this.commonElementsInArray.findCommonElements());
	}

}
