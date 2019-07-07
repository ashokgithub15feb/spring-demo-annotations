package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class DatabaseFortuneService implements FortuneService
{
	//@Autowired
	private FortuneService fortuneService;
	
	
	@Override
	public String getFortune() {
		return null;
	}
}
