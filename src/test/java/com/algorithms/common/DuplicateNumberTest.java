package com.algorithms.common;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.algorithms.common.DuplicateNumber;

public class DuplicateNumberTest {
	private DuplicateNumber duplicateNumber;
	
	@Before
	public void setup(){
		this.duplicateNumber = new DuplicateNumber();
	}

	@Test
	public void testFindBySorting() {
		int[] inputArr = new int[]{100,1,2,3,2,4,5,5,100};
		Set<Integer> actuals = this.duplicateNumber.findBySorting(inputArr);
		Set<Integer> expecteds = new HashSet<Integer>(Arrays.asList(100,2,5));
		assertEquals(expecteds, actuals);
	}
	
	@Test
	public void findByBruteForce(){
		int[] inputArr = new int[]{100,1,2,3,2,4,5,5,100};
		Set<Integer> actuals = this.duplicateNumber.findByBruteForce(inputArr);
		Set<Integer> expecteds = new HashSet<Integer>(Arrays.asList(100,2,5));
		assertEquals(expecteds, actuals);
	}

	@Test
	public void findWithinRange(){
		int[] inputArr = new int[]{1,2,2,3,4,5};
		int actuals = this.duplicateNumber.findWithinRange(inputArr);
		assertEquals(2, actuals);
		
	}
}
