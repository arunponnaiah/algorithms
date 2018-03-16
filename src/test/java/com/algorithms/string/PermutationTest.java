package com.algorithms.string;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PermutationTest {

    @Test
    public void testPermute(){
        Set<String> set = new HashSet<String>(Arrays.asList(new String[]{"ABC","ACB","BAC","BCA","CAB","CBA"}));
        Assert.assertEquals(set, Permutation.permute("", "ABC"));
    }
}