package com.algorithms.string;

import java.util.HashSet;
import java.util.Set;

public class Permutation {
    private static Set<String> set = new HashSet<String>();

    public static Set<String> permute(String prefix, String remaining){
        if(remaining.length() ==0){
            System.out.println(prefix);
            set.add(prefix);
            return set;
        }

        for(int i=0; i<remaining.length(); i++) {
            permute(prefix+remaining.charAt(i), remaining.substring(0,i)+remaining.substring(i+1,remaining.length()));
        }
        return set;
    }
}
