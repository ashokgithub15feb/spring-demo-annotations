package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve the bean
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("Pointing to the same object: "+result);
		System.out.println("Memory locaton for the Coach: "+theCoach);
		System.out.println("Memory locaton for Alpha Coach: "+alphaCoach);
		
		
		//call the bean
		
		//closing context
		context.close();
	}
}
