package com.luv2code.springdemo;

public class FizzBuzz {

	public static void main(String[] args) {

		for(int i = 1; i<=100; i++) {
			
			String reponse = (i % 15 == 0 )? "FizzBuzz" : ( i % 3 == 0) ? "Fizz" : ( i % 2 == 0) ? "Buzz" : "Rien"; 
			
			System.out.println(i + " - " + reponse);
		}
	}

}
