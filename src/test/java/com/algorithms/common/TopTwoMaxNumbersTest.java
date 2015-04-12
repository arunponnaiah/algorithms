package com.algorithms.common;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.algorithms.common.TopTwoMaxNumbers;

public class TopTwoMaxNumbersTest {
	
	private TopTwoMaxNumbers topTwoMaxNumbers;

	@Before
	public void setUp() throws Exception {
		this.topTwoMaxNumbers = new TopTwoMaxNumbers();
	}

	@Test
	public void testFind() {
		int inputArr[] = new int[]{5,1,3,4,2};
		assertArrayEquals(new int[]{5, 4},this.topTwoMaxNumbers.find(inputArr));
	}

}
