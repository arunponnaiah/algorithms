package com.algorithms.coderbyte;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.algorithms.coderbyte.ReverseString;

public class ReverseStringTest {
	private ReverseString reverseString;
	private static String strVal="Arun Ponnaiah";
	
	@Before
	public void setUp() {
		this.reverseString= new ReverseString();  
	}
	
	
	@Test
	public void testSimpleReverse(){
		String reverseString = this.reverseString.simpleReverse(strVal);
		System.out.println("simpleReverse >> "+reverseString);
		Assert.assertNotNull(reverseString);
		
	}
	
	@Test
	public void testIterativeReverse(){
		String reverseString = this.reverseString.iterativeReverse(strVal);
		System.out.println("iterativeReverse >> " +reverseString);
		Assert.assertNotNull(reverseString);
	}
	
	@Test
	public void testRecursiveReverse(){
		String reverseString = this.reverseString.recursiveReverse(strVal);
		System.out.println("recursiveReverse >> " +reverseString);
 		Assert.assertNotNull(reverseString);
	}
	
	@Test
	public void testReverseWordInString(){
		String reverseString = this.reverseString.reverseWordInString(strVal);
		System.out.println("reverseWordInString >> " +reverseString);
 		Assert.assertNotNull(reverseString);
	}
	
	
}
