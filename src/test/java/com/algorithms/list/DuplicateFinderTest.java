package com.algorithms.list;

import org.junit.Before;
import org.junit.Test;

public class DuplicateFinderTest {
	private DuplicateFinder duplicateFinder;
	@Before
	public void setUp() throws Exception {
		this.duplicateFinder = new DuplicateFinder();
	}

	@Test
	public void test() {
		this.duplicateFinder.find(new int[]{11,11,2,4,11,1,2,9,2,4});
	}

}
