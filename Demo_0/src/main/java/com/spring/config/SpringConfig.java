package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.repository.OwnerRepository;
import com.spring.repository.impl.OwnerRepositoryImpl;
import com.spring.service.OwnerService;
import com.spring.service.impl.OwnerServiceImpl;

@Configuration
public class SpringConfig {
//	@Bean
//	public OwnerService ownerService() {
//		System.out.println("inside config class...");
//		return new com.spring.service.mock.impl.OwnerServiceImpl(10);
//	}
//	@Bean("ownerServiceReal")
//	public OwnerService ownerService1() {
//		System.out.println("inside config class.....1");
//		return new OwnerServiceImpl(ownerRepository(),10);
//	}
//	@Bean
//	public OwnerRepository ownerRepository() {
//		System.out.println("inside config class................2");
//		return new OwnerRepositoryImpl();
//	}
	
	/*
	 * Setter Based Dependency Injection
	 */
	
	@Bean
	public OwnerService ownerService() {
		OwnerServiceImpl ownerServiceImpl = new OwnerServiceImpl();
		ownerServiceImpl.setOwnerRepository(ownerRepository());
		ownerServiceImpl.setOwnerId(10);
		return ownerServiceImpl;
	}
	@Bean
	public OwnerRepository ownerRepository() {
		return new OwnerRepositoryImpl();
	}
}
