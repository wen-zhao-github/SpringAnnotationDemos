package com.example.wen.springdemoannotations;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.example.wen.springdemoannotations")
@PropertySource("classpath:sport.properties")
public class SportsConfig {
	//define bean for fortune service
	@Bean
	public FortuneService tiredFortuneService (){//this method name will be bean id inside the spring container
		return new TiredFortuneService();
	}
	//define bean for swim coach and inject dependency
	@Bean
	public SwimCoach swimCoach(){
		return new SwimCoach(tiredFortuneService ());
	}

}
