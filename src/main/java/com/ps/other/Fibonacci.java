package com.ps.other;


public class Fibonacci {

	public void generate(int range) {
		int index = 0;
		if(index <= range){
			System.out.println(cal(index));
			index++;
		}
	}

	private int cal(int index){
		if(index==0) return 0;
		if(index==1) return 1;
		int fib = cal(index-1)+cal(index-2);
		return fib;
	}
}
