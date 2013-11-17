package com.ps.other;


public class Fibonacci {
	private int[] fibArr;
	public Fibonacci() {
		this.fibArr = new int[10];
	}
	public int[] generate(int range) {
		this.fibArr = new int[range]; //initialize array
		int index = 0;  // starting index of an array
		while(index < range){
			cal(index);
			index++;
		}
		return fibArr;
	}

	private int cal(int index){
		switch (index) {
			case 0:
				fibArr[index]=0;
				break;
			case 1:
				fibArr[index]=1;
				break;
			default:
				int fib = cal(index-1)+cal(index-2);
				fibArr[index]=fib;
				break;
		}
		return fibArr[index];
	}
}
