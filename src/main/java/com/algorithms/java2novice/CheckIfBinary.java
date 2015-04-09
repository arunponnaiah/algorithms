package com.algorithms.java2novice;

import java.util.regex.Pattern;


public class CheckIfBinary {
	
	public boolean isBinary(int number){
		return Pattern.matches("[01]{1,10}",String.valueOf(number));
	}
}
