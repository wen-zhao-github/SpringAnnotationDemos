package com.example.wen.springdemoannotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	@Value("${email}")
	private String email;
	@Value("${team}")
	private String team;
	
	public SwimCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swin 1000m as warm up!\n" +fortuneService.getFortune()+"\n"+team+"\n"+email;
	}

}
