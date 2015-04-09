package com.algorithms.java2novice;

public class BinaryToDecimal {
	private int exp=0;
	private int decimal =0;
	public int convert(int binary){
		if(binary!=0){
			decimal += (binary%10) * Math.pow(2, exp);
			exp++;
			convert(binary/10);
		}
		return decimal;
	}

}
