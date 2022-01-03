package com.in28Minutes.springBasics.springIntro;

import com.in28Minutes.springBasics.springIntro.basic.BinarySearchImpl;
import com.in28Minutes.springBasics.springIntro.properties.SomeExternalService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class SpringIntroPropertiesApplication {

	public static void main(String[] args) {


		//Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringIntroPropertiesApplication.class, args);

		SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
		System.out.println(someExternalService);
		String result = someExternalService.returnServiceURL();
		//int result = binarySearch.binarySearch(new int[]{1,2,3,4,5}, 3);

		System.out.println("my result "+ result);
	}

}
