package com.algorithms.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.algorithms.string.Palindrome;



/**
 * Junit to test Palindrome algorithm.
 * @author aponnaia
 *
 */
public class PalindromeTest {
	private Palindrome parlindrome;
	
	@Before
	public void setUp() throws Exception {
		this.parlindrome= new Palindrome();
	}

	@Test
	public void test1Palindrome() {
		Assert.assertEquals("aba", this.parlindrome.longest("231abazf"));
		
	}

	@Test
	public void test2Palindrome(){
		Assert.assertEquals("aabbaa", this.parlindrome.longest("212aabbaazf"));
	}
}
