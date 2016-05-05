package com.algorithms.sorting;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class SortMapByValueTest {
	
	private SortMapByValue sortMapByValue;
	private Map<String, Integer> map;

	@Before
	public void setUp() throws Exception {
		map = new HashMap<String, Integer>();
		map.put("yahoo.com", 25);
        map.put("google.com", 100);
        map.put("facebook.com", 75);
        
        sortMapByValue = new SortMapByValue();
	}

	@Test
	public void test() {
		String expectedResult="[google.com=100, facebook.com=75, yahoo.com=25]";
		String actualResult = this.sortMapByValue.sort(map);
		Assert.assertEquals(expectedResult, actualResult);
	}
}
