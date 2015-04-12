package com.algorithms.common;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.algorithms.common.ReverseNumber;

public class ReverseNumberTest {
	private ReverseNumber reverserNumber;

	@Before
	public void setUp() throws Exception {
		this.reverserNumber = new ReverseNumber();
	}

	@Test
	public void test() {
		int reversedNo = this.reverserNumber.generate(1000);
		assertEquals(0001, reversedNo);
	}

}
