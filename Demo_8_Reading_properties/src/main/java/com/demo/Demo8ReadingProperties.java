package com.demo;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import com.spring.service.impl.OwnerServiceImpl;

@PropertySource("classpath:messages.properties")
@SpringBootApplication(scanBasePackages = { "com.spring.repository", "com.spring.service" })
public class Demo8ReadingProperties implements CommandLineRunner {

	@Autowired
	OwnerServiceImpl ownerServiceImpl;
	private static final Logger LOGGER = LoggerFactory.getLogger(Demo8ReadingProperties.class);

	public static void main(String[] args) {
		SpringApplication.run(Demo8ReadingProperties.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			LOGGER.info("started logging...");
			Scanner sc = new Scanner(System.in);
			System.out.println("--------------------------------------------------------------------");
			System.out.println(ownerServiceImpl.findOwner());
			System.out.println("Enter the Owner Id: ");
			int newOwnerId = sc.nextInt();
			ownerServiceImpl.modifyOwnerId(newOwnerId);
			System.out.println(ownerServiceImpl.findOwner());
			System.out.println("--------------------------------------------------------------------");	
		}catch (Exception e) {
			LOGGER.error(e.getMessage(),e);
		}
	}

}
