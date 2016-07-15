package com.algorithms.list;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class MinimumDiffInListTest {
	private MinimumDiffInList minimumDiffInList;
	@Before
	public void setUp() throws Exception {
		this.minimumDiffInList = new MinimumDiffInList();
	}

	@Test
	public void test1() {
		Assert.assertEquals(0, minimumDiffInList.get(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 4, 5))));
	}

	@Test
	public void test2() {
		Assert.assertEquals(1, minimumDiffInList.get(new ArrayList<Integer>(Arrays.asList(1, -2, 3, -4, 4, -5))));
	}
}
