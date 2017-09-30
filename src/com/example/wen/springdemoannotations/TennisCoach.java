package com.example.wen.springdemoannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("RESTFortuneService")
	private FortuneService fortuneService;
	
	//define my init method
	@PostConstruct
	public void doMyStuffForInit(){
		System.out.println("doMyStuffForInit");
	}
	//define my destroy method
	@PreDestroy
	public void doMyCleanUpStuff(){
		System.out.println("doMyCleanUpStuff");
	}

	@Override
	public String getDailyWorkout() {
		
		return "Tennis work out!" +"  "+fortuneService.getFortune();
	}

}
