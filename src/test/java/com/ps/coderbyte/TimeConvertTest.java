package com.ps.coderbyte;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TimeConvertTest {
	private TimeConvert timeConvert; 

	@Before
	public void setUp() throws Exception {
		this.timeConvert = new TimeConvert();
	}

	@Test
	public void convert() {
		String result = this.timeConvert.convert(126);
		assertEquals("2:6", result);
	}

}
