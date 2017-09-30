package com.example.wen.springdemoannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PingpongConfig {
	@Bean
	public FortuneService excitedFortuneService(){
		return new ExcitedFortuneService();
	}
	@Bean
	public Coach pingpongCoach(){
		return new PingpongCoach(excitedFortuneService());
	}

}
