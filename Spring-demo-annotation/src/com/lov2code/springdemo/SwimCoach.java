package com.lov2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	
	private FortuneService fortuneservice;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(FortuneService thefortuneservice) {
		fortuneservice=thefortuneservice;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim 100 meater as a warm up";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFartuneService();
	}
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}

}
