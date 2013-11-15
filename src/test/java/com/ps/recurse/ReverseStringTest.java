package com.ps.recurse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseStringTest {
	private ReverseString reverseString;
	private static String strVal="Arun is a software developer";
	
	@Before
	public void setUp() {
		this.reverseString= new ReverseString();  
	}
	
	@Test
	public void testIterativeReverse(){
		String reverseString = this.reverseString.iterativeReverse(strVal);
		System.out.println(reverseString);
		Assert.assertNotNull(reverseString);
	}
	
	@Test
	public void testRecursiveReverse(){
		String reverseString = this.reverseString.recursiveReverse(strVal);
		System.out.println(reverseString);
 		Assert.assertNotNull(reverseString);
	}
	
	@Test
	public void testReverseWordInString(){
		String reverseString = this.reverseString.recursiveReverse(strVal);
		System.out.println(this.reverseString.reverseWordInString(reverseString));
		
	}
	
}
