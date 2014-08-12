package com.ps.regex;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringValidationTest {
	private StringValidation stringValidation;
	
	@Before
	public void setup(){
		this.stringValidation = new StringValidation();
	}
	
	@Test
	public void hasAlphabets(){
		String in = "123Ab456";
		boolean hasAlphabets = this.stringValidation.hasAlphabets(in);
		System.out.println(hasAlphabets);
		Assert.assertTrue(hasAlphabets);
	}
}
