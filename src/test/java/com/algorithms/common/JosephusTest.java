package com.algorithms.common;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.algorithms.common.Josephus;

public class JosephusTest {
	private Josephus josephus;

	@Before
	public void setUp() throws Exception {
		this.josephus = new Josephus();
	}

	@Test
	public void testExecute() {
		int n=41,k=3;
		assertEquals(31,this.josephus.findSurvivorByList(n, k));
		assertEquals(31,this.josephus.findSurvivorByRecursion(n, k));
	}
}
