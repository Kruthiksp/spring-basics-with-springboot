package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.SpringConfig;
import com.spring.service.OwnerService;

public class Demo3 {
	
	public static void main(String[] args) 
	{
 		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		OwnerService ownerService = context.getBean("ownerService",OwnerService.class);
		System.out.println(ownerService.findOwner());

		((AnnotationConfigApplicationContext) context).close();
	}
}
