package com.algorithms.java2novice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinaryToDecimalTest {
	
	private BinaryToDecimal binaryToDecimal;

	@Before
	public void setUp() throws Exception {
		this.binaryToDecimal = new BinaryToDecimal();
	}

	@Test
	public void testConvert3() {
		assertEquals(3,this.binaryToDecimal.convert(11));
	}
	
	@Test
	public void testConvert6() {
		assertEquals(6,this.binaryToDecimal.convert(110));
	}
	
	@Test
	public void testConvert38() {
		assertEquals(38,this.binaryToDecimal.convert(100110));
	}

}
