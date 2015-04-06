package com.algorithms.java2novice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CommonElementsInArrayTest {
	private CommonElementsInArray commonElementsInArray;
	private int[] firstArray;
	private int[] secondArray;
	
	
	@Before
	public void setUp() throws Exception {
		this.firstArray= new int[]{1,2,3};
		this.secondArray= new int[]{5,4,3};
		this.commonElementsInArray = new CommonElementsInArray(firstArray,secondArray);
	}

	@Test
	public void testFind() {
		assertArrayEquals(new int[]{5}, this.commonElementsInArray.findCommonElements());
		
	}

}
