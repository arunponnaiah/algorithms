package com.algorithms.integers;

import java.util.ArrayList;
import java.util.List;
/**
 * Given a sorted array of unique integers between 0 and 99 (inclusive), 
 * write a function which returns a string summarizing any gaps in the array.
 * Gaps should be separated by a comma and space.
 * Missing ranges should be summarized by the first number of the range, then a hyphen, then the last number of the range.
 * 
 * Example:
 * INPUT:  int[](3, 4, 5, 6, 50, 51, 53, 76)
 * OUTPUT: “0-2, 7-49, 52, 54-75, 77-99”
 * @author arunponnaiah
 *
 */
public class FindGap {
	
	/**
	 * Main function to take sorted integer array and returns String.
	 * @param input
	 * @return
	 */
	public String summarizeGaps(int[] input) {
		   List<String> output = new ArrayList<String>();
		   int min,max=0;
		   
		   for(int i=0;i<input.length;i++){
			   // start index
		        if(i==0){
		        	min=0;
		        	max=input[i]-1;
		        	output.add(min+"-"+max);
		        }//end index
		        else if(i==input.length-1){
		        	min= input[i] +1;
		        	max=99;
		        	output.add(min+"-"+max);
		        }// middle indices
		        else if(i < input.length-1){
		        	if(input[i+1] - input[i] ==1){
		        		continue;
		        	}else if(input[i+1] - input[i] == 2){
		        		max = input[i]+1;
		        		output.add(max+"");
		        	}else{
		        		min = input[i]+1;
		        		max = input[i+1]-1;
		        		output.add(min+"-"+max);
		        	}
		        }
		   }
		   
		   return createFinalStringFromList(output);
		}

	/**
	 * Creates final string format with comma and space between each gap.
	 * @param output
	 * @return
	 */
	private String createFinalStringFromList(List<String> output) {
		StringBuilder stringBuilder = new StringBuilder();
		   for(int i=0; i< output.size();i++){
			   if(i == output.size()-1){
				   stringBuilder.append(output.get(i));
			   } else{
				   stringBuilder.append(output.get(i)).append(", ");
			   }
		   }
		    return stringBuilder.toString();
	}
	
	
}
