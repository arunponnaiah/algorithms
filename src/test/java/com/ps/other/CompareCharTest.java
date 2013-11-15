package com.ps.other;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CompareCharTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		if('a'=='b') System.out.println("not equals");
		if('a'=='a') System.out.println("equals");
		if('a'<'b') System.out.println("< ");
		if('a'>'b') System.out.println("< ");
	}

}
