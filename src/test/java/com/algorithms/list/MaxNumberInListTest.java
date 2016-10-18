package com.algorithms.list;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class MaxNumberInListTest {

	@Test
	public void test() {
		Assert.assertEquals(10,MaxNumberInList.find(new ArrayList<Integer>(Arrays.asList(0, 10, -2, 2, 3))));
	}

}
