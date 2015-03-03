package com.algorithms.coderbyte;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.algorithms.coderbyte.AlphabetSoup;

public class AlphabetSoupTest {
	private AlphabetSoup alphabetSoup;
	
	@Before
	public void setUp() throws Exception {
		this.alphabetSoup = new AlphabetSoup();
	}

	@Test
	public void test() {
		String result = this.alphabetSoup.test("hooplah");
		assertEquals("ahhloop", result);
	}

}
