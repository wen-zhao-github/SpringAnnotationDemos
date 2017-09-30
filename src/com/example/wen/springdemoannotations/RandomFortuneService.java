package com.example.wen.springdemoannotations;

import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
	private String [] fortunes = {
			"Good day, huh?!",
			"Tomorrow will be even better",
			"May the force be with you"
	};

	@Override
	public String getFortune(){
		Random random = new Random();
		int index = random.nextInt(fortunes.length);
		return fortunes[index];
	}
	

}
