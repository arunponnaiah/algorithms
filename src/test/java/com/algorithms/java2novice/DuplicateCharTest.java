package com.algorithms.java2novice;

import java.util.HashSet;
import java.util.Set;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class DuplicateCharTest {
	private DuplicateChar duplicateChar;

	@Before
	public void setUp() throws Exception {
		this.duplicateChar = new DuplicateChar();
	}

	@Test
	public void testFind() {
		Set<Character> duplicates = new HashSet<Character>();
		duplicates.add('a');
		duplicates.add('n');
		Assert.assertEquals(duplicates, duplicateChar.find("Arun Ponnaiah"));
	}

}
