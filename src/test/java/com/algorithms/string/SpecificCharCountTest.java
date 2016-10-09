package com.algorithms.string;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class SpecificCharCountTest {

	@Test
	public void test() throws IOException {
		Assert.assertEquals(3, SpecificCharCount.countChar("/Users/arunponnaiah/test.txt",'A'));
	}

}
