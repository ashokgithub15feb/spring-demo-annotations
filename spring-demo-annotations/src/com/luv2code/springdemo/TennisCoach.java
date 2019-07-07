package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//spring will automatically register this bean : beanId = thatSillyCoach
//@Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//@Autowired //Constructor Injection Autowired is optional
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	public TennisCoach() {
		System.out.println(">> TennisCoach: Inside default Constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">> TennisCoach: Inside default setFortuneService");
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	//define my init method
	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println(">> TennisCoach: inside of doMyStartupStuff method");
	}
	//define my destroy method
	@PreDestroy
	public void doMyDestroyStuff()
	{
		System.out.println(">> TennisCoach: inside of doMyDestroyStuff method");
	}
}
