package com.ps.popsugar;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JosephusTest {
	private Josephus josephus;

	@Before
	public void setUp() throws Exception {
		this.josephus = new Josephus();
	}

	@Test
	public void testExecute() {
		int n=41,k=3;
		assertEquals(30,this.josephus.execute(n, k));
	}
}
