package com.algorithms.list;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonRecuringElementInListTest {
	private NonRecuringElementInList nonRecuringElementInList;
	
	@Before
	public void setUp() throws Exception {
		this.nonRecuringElementInList = new NonRecuringElementInList();
	}

	@Test
	public void test() {
		Assert.assertEquals(2,this.nonRecuringElementInList.get(new ArrayList<Integer>(Arrays.asList(1, 2, 1))));
	}

}
