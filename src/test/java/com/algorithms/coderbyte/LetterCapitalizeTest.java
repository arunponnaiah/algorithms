package com.ps.coderbyte;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ps.coderbyte.LetterCapitalize;

public class LetterCapitalizeTest {
	private LetterCapitalize letterCapitalize;

	@Before
	public void setUp() throws Exception {
		this.letterCapitalize = new LetterCapitalize();
	}

	@Test
	public void testCapitalize(){
		String result = this.letterCapitalize.capitalize("arun kumar");
		System.out.println(result);
		assertEquals("Arun Kumar", result);
	}

}
