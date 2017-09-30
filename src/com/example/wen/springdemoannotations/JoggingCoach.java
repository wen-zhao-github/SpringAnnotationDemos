package com.example.wen.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class JoggingCoach implements Coach {
	@Autowired
	@Qualifier("happyFortuneService")	
	private FortuneService fortuneService;
	



	public JoggingCoach(){
		System.out.println("non-arg constructor");
	}

	@Override
	public String getDailyWorkout() {
		
		return "never stop jogging" +"  "+ fortuneService.getFortune();
	}

}
