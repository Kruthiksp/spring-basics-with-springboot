package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.SpringConfig;
import com.spring.service.impl.OwnerServiceImpl__Construction_AW;
import com.spring.service.impl.OwnerServiceImpl__Property_AW;
import com.spring.service.impl.OwnerServiceImpl__Setter_AW;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		OwnerServiceImpl__Construction_AW ownerServiceImpl__Construction_AW = context.getBean("ownerServiceImpl__Construction_AW",OwnerServiceImpl__Construction_AW.class);
		OwnerServiceImpl__Setter_AW ownerServiceImpl__Setter_AW = context.getBean("ownerServiceImpl__Setter_AW",OwnerServiceImpl__Setter_AW.class);
		OwnerServiceImpl__Property_AW ownerServiceImpl__Property_AW = context.getBean("ownerServiceImpl__Property_AW",OwnerServiceImpl__Property_AW.class);
		
		System.out.println(ownerServiceImpl__Construction_AW.findOwner());
		System.out.println(ownerServiceImpl__Setter_AW.findOwner());
		System.out.println(ownerServiceImpl__Property_AW.findOwner());
		
		((AnnotationConfigApplicationContext)context).close();
	}
}
