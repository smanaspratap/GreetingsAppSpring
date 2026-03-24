package com.example.GreetingsAppSpring;

import com.example.GreetingsAppSpring.component.DemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GreetingsAppSpringApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Spring Concept Demo");
		ApplicationContext context = SpringApplication.run(GreetingsAppSpringApplication.class, args);
		System.out.println("Checking Context: " + context.getBean(DemoBean.class));
	}
}
