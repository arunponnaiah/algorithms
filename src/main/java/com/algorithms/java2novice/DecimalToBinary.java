package com.algorithms.java2novice;

public class DecimalToBinary {

	public String toBinary(int n) {
		// TODO Auto-generated method stub
		int reminder=0;
		StringBuilder binary=new StringBuilder();
		while(n>0){
			reminder = n%2;
			binary.append(reminder);
			n= n/2;
		}
		return binary.reverse().toString();
	}

}
