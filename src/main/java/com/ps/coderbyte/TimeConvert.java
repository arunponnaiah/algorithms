package com.ps.coderbyte;

public class TimeConvert {
	public String convert(int in){
		int quotient = in/60;
		int reminder = in%60;
		if( quotient > 0){
			return quotient+":"+reminder;
		}else{
			return 0+":"+reminder;
		}
	}
}
