package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.service.impl.OwnerServiceImpl_Common;
import com.spring.service.impl.OwnerServiceImpl_Special;

@ComponentScan({
		"com.spring.service.impl",
		"com.spring.repository.impl"
	}
)
public class Demo {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Demo.class);
		OwnerServiceImpl_Common commonService = context.getBean("commonService",OwnerServiceImpl_Common.class);
		OwnerServiceImpl_Special specialService = context.getBean("specialService",OwnerServiceImpl_Special.class);
		
		System.out.println(commonService.findOwner());
		System.out.println(specialService.findOwner());
		
		((AnnotationConfigApplicationContext)context).close();
	}
}
