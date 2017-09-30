package com.example.wen.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeDemoApp {

	public static void main(String[] args) {
		// read config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean 
		Coach first = context.getBean("tennisCoach", Coach.class);
		//Coach second = context.getBean("tennisCoach", Coach.class);
		//call method
		System.out.println(first.getDailyWorkout());
		//close the context
		context.close();

	}

}
