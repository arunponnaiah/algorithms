package com.ps.java2novice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

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
