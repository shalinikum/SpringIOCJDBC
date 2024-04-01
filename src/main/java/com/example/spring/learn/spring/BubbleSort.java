package com.example.spring.learn.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortAlgorithms {
	public int[] sort(int[] nums) {
		return nums;
	}

}
