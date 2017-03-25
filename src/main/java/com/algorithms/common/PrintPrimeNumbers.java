package com.algorithms.common;

import java.util.List;
import java.util.ArrayList;

/**
 * Print first n prime numbers.
 * 
 * what is a prime number: A number that is divide by 1 and by itself.
 * @author arunponnaiah
 *
 */
public class PrintPrimeNumbers {
	public List<Integer> print(int range){
		List<Integer> list = new ArrayList<Integer>();
		int number=2;
		int counter =1;
		
		while(counter <= range){
			boolean isPrime = true;
			// skip 1 & number in for loop - because need to make sure if it divisible by any other number besides 1 & number.
			for(int i=2;i<number;i++){
				if(number%i == 0){
					isPrime = false;
					break;
				}
			}
			
			if(isPrime){
				list.add(number);
				counter++;
			}
			number++;
		}
		
		return list;
	}
}
