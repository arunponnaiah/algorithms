package com.algorithms.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class MergeListsToOneSortedListTest {


	@Test
	public void test() {
		List<Integer> list1 = initializeList1();
		List<Integer> list2 = initializeList2();
		List<List<Integer>> listOfSortedLists = createListOfLists(list1, list2);
		List<Integer> expectedOutput = new ArrayList<Integer>(Arrays.asList(new Integer[]{1,2,3,4,5,6}));
		Assert.assertEquals(expectedOutput,MergeListsToOneSortedList.getFinalSortedList(listOfSortedLists));
	}
	

	private List<List<Integer>> createListOfLists(List<Integer> list1, List<Integer> list2) {
		List<List<Integer> > listOfSortedLists = new ArrayList<List<Integer>>();
		listOfSortedLists.add(list1);
		listOfSortedLists.add(list2);
		return listOfSortedLists;
	}

	private List<Integer> initializeList1() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		return list;
	}
	
	private List<Integer> initializeList2() {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(6);
		return list;
	}
	

}
