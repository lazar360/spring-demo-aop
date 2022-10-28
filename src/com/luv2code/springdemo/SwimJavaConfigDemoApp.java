package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
				
		// get the bean from the spring container : toujours repartir de l'interface (on se pose pas de question sur les classes implémentant)
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());

		// call method to get email and team
		System.out.println("email : " + theCoach.getEmail());

		System.out.println("email : " + theCoach.getTeam());
		
		// close the context 
		context.close();
	}

}
