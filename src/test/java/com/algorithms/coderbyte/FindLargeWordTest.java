package com.algorithms.coderbyte;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FindLargeWordTest {
	private FindLargeWord findLargeWord;
	@Before
	public void setUp() throws Exception {
		this.findLargeWord = new FindLargeWord();
	}

	@Test
	public void testFind(){
		String largeWord = this.findLargeWord.find("Arun@@@@!!!*** is application developer");
		assertEquals("application", largeWord);
	}

}
