package com.ps.coderbyte;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.ps.coderbyte.Factorial;

public class FactorialTest {
	private Factorial factorial;

	@Before
	public void setup(){
		this.factorial = new Factorial();
	}
	
	@Test
	public void testFactorial(){
		int result = this.factorial.calculate(4);
		System.out.println(" result : "+ result);
		Assert.assertEquals(24, result);
	}

}
