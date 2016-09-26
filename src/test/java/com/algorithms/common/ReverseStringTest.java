package com.algorithms.common;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.algorithms.common.ReverseString;

public class ReverseStringTest {
	private ReverseString reverseString;
	private static String strVal="Ponnaiah";
	
	@Before
	public void setUp() {
		this.reverseString= new ReverseString();  
	}
	
	@Test
	public void testSimpleReverse(){
		String reverseString = this.reverseString.simpleReverse(strVal);
		Assert.assertEquals("haiannoP", reverseString);
	}
	
	@Test
	public void testRecursiveReverse(){
		String reverseString = this.reverseString.recursiveReverse(strVal);
		Assert.assertEquals("haiannoP", reverseString);
	}
	
	@Test
	public void testReverseUsingSwap(){
		String reverseString = this.reverseString.reverseUsingSwap(strVal);
 		Assert.assertEquals("haiannoP", reverseString);
	}
	
}
