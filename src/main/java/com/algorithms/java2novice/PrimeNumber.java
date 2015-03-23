package com.algorithms.java2novice;

public class PrimeNumber {
	int number =0;

	public boolean isPrime(int number) {
		int divisor=2;
		while( (divisor < number)){
			if((number % divisor) == 0 ){
				return true;
			}
			divisor++;
		}
		return false;
	}
}
