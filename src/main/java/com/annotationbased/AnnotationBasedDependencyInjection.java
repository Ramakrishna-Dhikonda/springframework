package com.annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBasedDependencyInjection {

	@Bean
	public static void main(String args[]) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		if (applicationContext.containsBean("computer")) {
			Computer computer = (Computer) applicationContext.getBean("computer", Computer.class);
			System.out.println(computer);
		}
	}

}
