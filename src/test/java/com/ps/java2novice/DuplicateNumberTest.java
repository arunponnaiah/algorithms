package com.ps.java2novice;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class DuplicateNumberTest {
	private DuplicateNumber duplicateNumber;
	private int[] inputArr;
	
	@Before
	public void setup(){
		this.duplicateNumber = new DuplicateNumber();
		this.inputArr = new int[]{100,1,2,3,2,4,5,5,100};
	}

	@Test
	public void testFindBySorting() {
		Set<Integer> actuals = this.duplicateNumber.findBySorting(inputArr);
		Set<Integer> expecteds = new HashSet<Integer>(Arrays.asList(100,2,5));
		assertEquals(expecteds, actuals);
	}
	
	@Test
	public void findByBruteForce(){
		Set<Integer> actuals = this.duplicateNumber.findByBruteForce(inputArr);
		Set<Integer> expecteds = new HashSet<Integer>(Arrays.asList(100,2,5));
		assertEquals(expecteds, actuals);
	}

}
