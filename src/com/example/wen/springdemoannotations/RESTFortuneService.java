package com.example.wen.springdemoannotations;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;

@Component
public class RESTFortuneService implements FortuneService {
	private ArrayList<String> fortunes = new ArrayList<String>();
	private String todayFortune;

	
	//init fields via properties file
	@PostConstruct
	public void initField(){
		System.out.println("inside init field method");
		File file = new File("C:/Users/George/EclipseMar/SpringDemoAnnotations/src/fortune-data.txt");
		BufferedReader input;
	    try{
	    	input = new BufferedReader(new FileReader(file));
	    	String temp ;
	    	while((temp = input.readLine())!= null){
	    		fortunes.add(temp);
	    	}
	    	System.out.println(fortunes.size());
	    
	    }catch(Exception e){
	    	e.printStackTrace();
	    }finally{
	    	
	    }
	    Random random = new Random();
	    int index = random.nextInt(fortunes.size());
	    todayFortune = fortunes.get(index);
	    
	}
	

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "REST Fortune Service"+todayFortune;
	}

}
