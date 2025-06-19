package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan({
		"com.spring.service.impl",
		"com.spring.repository.impl"
	}
)
@Configuration
public class SpringConfig {

}
