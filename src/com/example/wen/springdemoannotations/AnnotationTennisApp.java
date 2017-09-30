package com.example.wen.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTennisApp {

	public static void main(String[] args) {
		//load spring config 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve beans
		Coach coach = context.getBean("yogaCoach", Coach.class);
		//call methdods on the bean
		System.out.println(coach.getDailyWorkout());
		//close the container
		context.close();

	}

}
