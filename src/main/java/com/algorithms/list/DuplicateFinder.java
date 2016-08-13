package com.algorithms.list;

import java.util.Arrays;
/**
 * DuplicateFinder - It finds the duplicates in int[] using XOR operator.
 * @author aponnaia
 *
 */
public class DuplicateFinder {
	
	public void find(int[] num)
    {
		int arrLen = num.length;
        Arrays.sort(num);
        int preVal=0;
        for(int i = 0; i < arrLen-1; i++)
        {
    	  if((num[i]^num[i+1]) == 0
    			  && (num[i]^preVal) !=0){
    		  preVal=num[i];
    		  System.out.println(num[i]);
    	  }
        }         
    } 

}
