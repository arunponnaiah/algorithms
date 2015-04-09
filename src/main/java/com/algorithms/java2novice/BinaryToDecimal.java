package com.algorithms.java2novice;

/**
 * convert binary to decimal number
 * @author aponnaiah
 *
 */
public class BinaryToDecimal {
	private int exp=0;
	private int decimal =0;
	
	/**
	 * convert binary to decimal number using recursion
	 * @param binary
	 * @return
	 */
	public int convert(int binary){
		if(binary!=0){
			decimal += (binary%10) * Math.pow(2, exp);
			exp++;
			convert(binary/10);
		}
		return decimal;
	}

}
