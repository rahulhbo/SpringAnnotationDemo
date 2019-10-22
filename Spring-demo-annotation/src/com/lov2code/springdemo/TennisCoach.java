package com.lov2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
//@Component("thatSillyCoach")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneservice;
	
	public TennisCoach() {
		System.out.println(">>TennisCoach : under default constructor");
	}
	
	/*
	 * @Autowired public void DosumCrazzyStuff(FortuneService fortuneservice) {
	 * 
	 * System.out.println("TennisCoach :under DosumCrazzyStuff methord");
	 * this.fortuneservice = fortuneservice; }
	 */


	/*
	 * @Autowired public TennisCoach(FortuneService thefortuneservice) {
	 * fortuneservice=thefortuneservice; }
	 */
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFartuneService() ;
	}

	

}
