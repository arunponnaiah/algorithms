package com.algorithms.common;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import com.algorithms.common.MaxRepeatWords;

public class MaxRepeatWordsTest {
	private MaxRepeatWords maxRepeatWords;
	
	@Before
	public void setUp() throws Exception {
		this.maxRepeatWords = new MaxRepeatWords();
	}

	@Test
	public void testFind() throws Exception {
		File file = new File("src/main/resources/input.txt");
		
		assertEquals("Arun",this.maxRepeatWords.find(file));
	}

}
