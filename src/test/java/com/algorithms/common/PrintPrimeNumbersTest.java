package com.algorithms.common;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class PrintPrimeNumbersTest {

	@Test
	public void test() {
		PrintPrimeNumbers primeNumbers = new PrintPrimeNumbers();
		List<Integer> expectedList = new ArrayList<Integer>();
		expectedList.add(2);
		expectedList.add(3);
		expectedList.add(5);
		expectedList.add(7);
		expectedList.add(11);
		
		Assert.assertEquals(expectedList, primeNumbers.print(5));
	}

}
