package com.in28Minutes.springBasics.springIntro;

import com.in28Minutes.springBasics.springIntro.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIntroBasicApplication {

	public static void main(String[] args) {
		//
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
//		int result = binarySearch.binarySearch(new int[]{1,2,3,4,5}, 3);
//		System.out.println("my result "+ result);

		//Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringIntroBasicApplication.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[]{1,2,3,4,5}, 3);
		System.out.println("my result "+ result);
	}

}
