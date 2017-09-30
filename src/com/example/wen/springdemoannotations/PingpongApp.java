package com.example.wen.springdemoannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PingpongApp {

	public static void main(String[] args) {
		// read config
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PingpongConfig.class);
		//retrieve bean
		Coach coach = context.getBean("pingpongCoach", Coach.class);
		//call method
		System.out.println(coach.getDailyWorkout());
		//close context
		context.close();

	}

}
