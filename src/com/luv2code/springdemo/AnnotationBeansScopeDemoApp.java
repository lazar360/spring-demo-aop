package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeansScopeDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//check if they are the same
		//boolean result = (theCoach == alphaCoach);
		String result = (theCoach == alphaCoach) ? "Super ! C'est identique" : "Oh non, c'est tout pourri...Pas identique quoi";
	
		//print the result
		System.out.println(result);
		
		System.out.println("\nMemory location for the coach"+ theCoach);
		System.out.println("\nMemory location for alphacoach"+ alphaCoach + "\n");
		
		//close the context
		context.close();
		
	}

}
