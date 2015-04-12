package com.algorithms.common;

public class TimeConvert {
	public String convert(int in){
		int quotient = in/60;
		System.out.println("quotient >> " + quotient);
		int reminder = in%60;
		System.out.println("reminder >> " + reminder);
		return quotient+":"+reminder;
	}
}
