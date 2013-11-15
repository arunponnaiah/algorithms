package com.algorithm.other;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public List<String> print(String text) {
	    List<String> results = new ArrayList<String>();

	    // the base case
	    if (text.length() == 1) {
	        results.add(text);
	        return results;
	    }

	    for (int i = 0; i < text.length(); i++) {
	        char first = text.charAt(i);
	        String remains = text.substring(0, i) + text.substring(i + 1);
	        List<String> innerPermutations = print(remains);
	        for (int j = 0; j < innerPermutations.size(); j++)
	            results.add(first + innerPermutations.get(j));
	    }

	    return results;
	}

}
