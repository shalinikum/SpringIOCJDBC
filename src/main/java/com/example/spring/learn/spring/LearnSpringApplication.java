package com.example.spring.learn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSort());
		
		ApplicationContext applicationContext = SpringApplication.run(LearnSpringApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {1,4,3,2}, 4);
		System.out.println(result);
		//SpringApplication.run(LearnSpringApplication.class, args);
	}

}
