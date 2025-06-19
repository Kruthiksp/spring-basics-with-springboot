package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.SpringConfig;
import com.spring.service.OwnerService;

public class Demo2 {
	
	public static void main(String[] args) 
	{
 		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		OwnerService ownerService = (OwnerService) context.getBean("ownerServiceReal");
		OwnerService ownerService1 = context.getBean("ownerService",OwnerService.class);
		System.out.println(ownerService.findOwner());
		System.out.println(ownerService1.findOwner());

		((AnnotationConfigApplicationContext) context).close();
	}
}
