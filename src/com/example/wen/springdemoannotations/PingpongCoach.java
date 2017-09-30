package com.example.wen.springdemoannotations;

public class PingpongCoach implements Coach {
	private FortuneService fortuneService;
	

	public PingpongCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Pingpong\n"+fortuneService.getFortune();
	}

}
