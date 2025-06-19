package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.service.impl.OwnerServiceImpl__Property_AW;

//@ComponentScan({ "com.spring.service.impl", "com.spring.repository.impl" })
//@Configuration

/*
	@SpringBootApplication
	this annotation is a combination of 
	-> @Configuration
	-> @EnableAutoConfiguration
	-> @ComponentScan
*/

@SpringBootApplication(scanBasePackages = { "com.spring.service.impl", "com.spring.repository.impl" })
public class Demo implements CommandLineRunner{
	@Autowired
	private OwnerServiceImpl__Property_AW ownerServiceImpl__Property_AW;

	public static void main(String[] args) {
//		ApplicationContext context = new AnnotationConfigApplicationContext(Demo.class);
		SpringApplication.run(Demo.class, args);
	}

//	public void sample() {
//		System.out.println("sample() method.............................");
//		System.out.println(ownerServiceImpl__Property_AW.findOwner());
//	}

	
	/*
	 * this method is invoked by 
	 * 		SpringApplication.run(Demo.class, args); 
	 * in the main method
	 * 
	 */
	@Override
	public void run(String... args) throws Exception {
		System.out.println("sample() method.............................");
		System.out.println(ownerServiceImpl__Property_AW.findOwner());
	}
}
