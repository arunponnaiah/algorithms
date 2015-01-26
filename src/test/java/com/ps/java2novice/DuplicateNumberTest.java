package com.ps.java2novice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DuplicateNumberTest {
	private DuplicateNumber duplicateNumber;
	
	@Before
	public void setup(){
		duplicateNumber = new DuplicateNumber();
	}

	@Test
	public void test() {
		int[] inputArr = new int[]{1,2,3,4,5};
		System.out.println(this.duplicateNumber.find(inputArr));
	}

}
