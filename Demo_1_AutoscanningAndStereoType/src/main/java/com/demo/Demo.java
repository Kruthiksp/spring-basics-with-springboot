package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.SpringConfig;
import com.spring.repository.impl.OwnerRepositoryImpl;
import com.spring.service.impl.OwnerServiceImpl;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		OwnerServiceImpl ownerServiceImpl = context.getBean("ownerServiceImpl",OwnerServiceImpl.class);
		OwnerRepositoryImpl ownerRepositoryImpl = context.getBean("ownerRepositoryImpl",OwnerRepositoryImpl.class);
		ownerServiceImpl.setOwnerRepository(ownerRepositoryImpl);
		ownerServiceImpl.setOwnerId(10);
		System.out.println(ownerServiceImpl.findOwner());
	}
}
