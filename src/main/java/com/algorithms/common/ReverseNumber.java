package com.algorithms.common;

public class ReverseNumber {

	public int generate(int number) {
		int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        }
        return reverse;
	}
}
