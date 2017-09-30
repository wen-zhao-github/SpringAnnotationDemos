package com.example.wen.springdemoannotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class YogaCoach implements Coach {
	@Value("${team}")
	private String team;
	@Value("${email}")
	private String email;

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return this.email + this.team + "with you yoga!";
	}

}
