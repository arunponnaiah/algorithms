package com.algorithms.list;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class MostFrequentNumberInListTest {
	private MostFrequentNumberInList mostFrequentNumberInList;
	
	@Before
	public void setup(){
		mostFrequentNumberInList = new MostFrequentNumberInList();
	}

	@Test
	public void test() {
		Assert.assertEquals(2,mostFrequentNumberInList.get(new ArrayList<Integer>(Arrays.asList(0, 1, 2, 2, 3))));
	}

}
