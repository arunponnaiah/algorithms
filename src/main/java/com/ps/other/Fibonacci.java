package com.ps.other;

import java.util.ArrayList;
import java.util.List;

/**
 * Generate Fibonacci numbers using recursive algorithm
 * @author Arun
 *
 */

public class Fibonacci {
	private List<Integer> fibonacciNumbers;
	private int range;
	
	public Fibonacci(){
		this.fibonacciNumbers = new ArrayList<Integer>();
	}
	
	public List<Integer> generate(int range) {
		this.range = range;
		int fn1=0;
		int fn2=1;
		fibonacciNumbers.add(fn1);
		fibonacciNumbers.add(fn2);
		calc(fn1,fn2);
		return fibonacciNumbers;
	}

	private void calc(int fn1, int fn2) {
		if(fibonacciNumbers.size() >= range){
			return;
		}
		
		int fibNum = fn1 + fn2;
		fibonacciNumbers.add(fibNum);
		calc(fn2,fibNum);
	}
}
