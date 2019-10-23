package com.lov2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config file
		/*
		 * ClassPathXmlApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml");
		 *///get the bean ID 
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
		Coach thecoach= context.getBean("tennisCoach",Coach.class);
		//call a method on the bean
		System.out.println(thecoach.getDailyWorkout());
		//call method to get the daily fortune
		System.out.println(thecoach.getDailyFortune());
		
		
		context.close();
	}

}
