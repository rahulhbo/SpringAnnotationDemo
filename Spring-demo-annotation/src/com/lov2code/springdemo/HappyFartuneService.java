package com.lov2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFartuneService implements FortuneService {

	@Override
	public String getFartuneService() {
		
		return "Today is your lucky day! ";
	}

}
