package com.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		/**
		 * In case of using new key word for creating an instance if there needs to be make any changes in future
		 * we have to make changes in java classes which may cause to regenerate .class files
		 * instead of that now we can move the responsibility of creating beans/instances to Container/Application context
		 * so if any changes required, we can simply make changes in 'XML' files..
		 */
		//StudentInformation studentInformation = new StudentInformation();
		StudentInformation information = (StudentInformation) applicationContext.getBean("StudentInformation", StudentInformation.class);
		information.printInformation();
		
	}
}