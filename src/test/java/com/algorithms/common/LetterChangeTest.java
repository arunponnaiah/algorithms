package com.algorithms.common;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.algorithms.common.LetterChange;

public class LetterChangeTest {
	private LetterChange letterChange;
	

	@Before
	public void setUp() throws Exception {
		this.letterChange = new LetterChange();
		
	}
	
	@Test
	public void testLetterChange(){
		String changedLetters = this.letterChange.changeLetter("hello world");
		assertEquals("Ifmmp xpsmE", changedLetters);
	}
}
