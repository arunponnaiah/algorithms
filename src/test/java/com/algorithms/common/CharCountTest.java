package com.algorithms.common;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class CharCountTest {
	public CharCount charCount;
	
	@Before
	public void setUp() throws Exception {
		this.charCount = new CharCount();
	}
	
	@Test
	public void test() {
		 String str = "abcabcdef";
		 String expectedResult ="{a=2, b=2, c=2, d=1, e=1, f=1}";
		 String actualResult = charCount.count(str);
		 Assert.assertEquals(expectedResult, actualResult);
	}

}
