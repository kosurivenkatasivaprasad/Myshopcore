package com.niit.myshopcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args){

		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		
		context.scan("com.niit.*");
		context.refresh();
		
		context.getBean("category");
		
		
		System.out.println("category is created");
	}		
}