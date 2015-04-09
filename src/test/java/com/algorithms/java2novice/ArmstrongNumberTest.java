package com.algorithms.java2novice;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class ArmstrongNumberTest {
	private ArmstrongNumber armStrongNumber;
	@Before
	public void setUp() throws Exception {
		this.armStrongNumber = new ArmstrongNumber();
	}

	@Test
	public void testArmstrongNUmber() {
		Assert.assertEquals(true,this.armStrongNumber.check(371));
	}
	
	@Test
	public void testNonArmstrongNumber() {
		Assert.assertEquals(false, this.armStrongNumber.check(37));
	}

}
