package com.ps.other;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RegularExpressionTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Pattern pattern = Pattern.compile("[!$%]");
		Matcher matcher = pattern.matcher("!Aru$n%Kp");
		while (matcher.find()) {
			System.out.println(matcher.replaceAll(""));
		}
	}

}
