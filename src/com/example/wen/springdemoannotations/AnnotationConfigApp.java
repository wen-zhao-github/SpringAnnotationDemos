package com.example.wen.springdemoannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApp {

	public static void main(String[] args) {
		//load spring config 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		//retrieve beans
		Coach coach = context.getBean("tennisCoach", Coach.class);
		//call methdods on the bean
		System.out.println(coach.getDailyWorkout());
		//close the container
		context.close();

	}

}
