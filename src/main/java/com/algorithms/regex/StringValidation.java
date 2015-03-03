package com.algorithms.regex;


public class StringValidation {
	public boolean hasAlphabets(String in) {
		String regex=".*[a-zA-Z].*";
		return in.matches(regex);
	}
}
