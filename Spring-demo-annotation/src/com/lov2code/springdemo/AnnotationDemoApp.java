package com.lov2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//get the bean ID 
		Coach thecoach= context.getBean("tennisCoach",Coach.class);
		//call a method on the bean
		System.out.println(thecoach.getDailyWorkout());
		//call method to get the daily fortune
		System.out.println(thecoach.getDailyFortune());
		
		
		context.close();
	}

}
