package com.example.spring.learn.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	private SortAlgorithms sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithms sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public int binarySearch(int[] nums , int targer) {
		
		int[] sortedNumber = sortAlgorithm.sort(nums);
		System.out.print(sortAlgorithm);
		
		return 3;
	}
	

}
