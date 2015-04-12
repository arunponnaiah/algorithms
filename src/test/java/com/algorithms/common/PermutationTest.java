package com.algorithms.common;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.algorithms.common.Permutation;

public class PermutationTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Permutation permutation = new Permutation();
//		int[] set=new int[]{1,2,3};
		
		List<String> results = permutation.print("123");
	}

}
