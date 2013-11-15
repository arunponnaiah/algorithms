package com.ps.other;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringImmutationTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String a ="Arun";
		String b ="Arun";
		if(a.equals(b) && a.hashCode() == b.hashCode()) System.out.println("equals");
		
	}

}
