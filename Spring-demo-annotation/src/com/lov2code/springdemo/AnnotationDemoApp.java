package com.lov2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//get the bean ID 
		Coach thecoach= context.getBean("thatSillyCoach",Coach.class);
		System.out.println(thecoach.getDailyWorkout());
		context.close();
	}

}
