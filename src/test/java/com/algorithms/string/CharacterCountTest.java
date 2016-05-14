package com.algorithms.string;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class CharacterCountTest {

	private CharacterCount characterCount;
	
	@Before
	public void setup(){
		characterCount = new CharacterCount();
	}
	
	@Test
	public void test() {
		String str = "abcabcdef";
		Assert.assertEquals(2, this.characterCount.count(str).get('a').intValue());
	}

}
