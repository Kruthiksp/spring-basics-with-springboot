package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.SpringConfig;
import com.spring.service.OwnerService;

public class Demo {
	public static void main(String[] args) {
		
		/*
		 * Tight coupling
		 */
		
//		OwnerRepositoryImpl ownerRepositoryImpl = new OwnerRepositoryImpl();
//		OwnerService ownerService = new OwnerServiceImpl(ownerRepositoryImpl, 10);
//		System.out.println(ownerService.findOwner());
		
		/*
		 * Loose coupling
		 */
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		OwnerService ownerService = context.getBean(OwnerService.class);
		System.out.println(ownerService.findOwner());
		
		((AnnotationConfigApplicationContext)context).close();
	}
}
