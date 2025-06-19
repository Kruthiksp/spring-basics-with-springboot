package com.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.service.impl.OwnerServiceImpl;

@SpringBootApplication(scanBasePackages = { "com.spring.repository", "com.spring.service" })
public class Demo6ScopeInSpringApplication implements CommandLineRunner {
	@Autowired
	private OwnerServiceImpl ownerServiceImpl1;
	@Autowired
	private OwnerServiceImpl ownerServiceImpl2;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo6ScopeInSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n----------------------------------------------------------------------");
		System.out.println("\nBefore calling modify method...");
		System.out.println(ownerServiceImpl1.findOwner());	//10
		System.out.println(ownerServiceImpl2.findOwner());	//10
		
		System.out.println("Enter new OwnerId: ");
		int newOwnerId = sc.nextInt();
		
		ownerServiceImpl1.modifyOwnerId(newOwnerId);
		
		System.out.println("\nAfter calling modify method...");
		System.out.println(ownerServiceImpl1.findOwner());	//20
		System.out.println(ownerServiceImpl2.findOwner());	//20
	}
}
