package com.algorithms.common;

import org.junit.Test;

import junit.framework.Assert;

public class IPValidationTest {
	
	@Test
	public void testValid1() {
		Assert.assertEquals(true, IPValidation.isValid("000.12.12.034"));
	}
	
	@Test
	public void testValid2() {
		Assert.assertEquals(true, IPValidation.isValid("121.234.12.12"));
	}
	
	@Test
	public void testValid3() {
		Assert.assertEquals(true, IPValidation.isValid("23.45.12.56"));
	}
	
	@Test
	public void testInValid1() {
		Assert.assertEquals(false, IPValidation.isValid("I.Am.not.an.ip"));
	}
	
	@Test
	public void testInValid2() {
		Assert.assertEquals(false, IPValidation.isValid("23.45.22.32."));
	}
	
	@Test
	public void testInValid3() {
		Assert.assertEquals(false, IPValidation.isValid(".213.123.23.32"));
	}
}
