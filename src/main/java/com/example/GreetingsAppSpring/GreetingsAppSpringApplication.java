package com.example.GreetingsAppSpring;

import com.example.GreetingsAppSpring.component.DemoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GreetingsAppSpringApplication {

	public static final Logger logger = LoggerFactory.getLogger(GreetingsAppSpringApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concept Demo");
		ApplicationContext context = SpringApplication.run(GreetingsAppSpringApplication.class, args);
		logger.debug("Checking Context: {}", context.getBean(DemoBean.class));
	}
}
