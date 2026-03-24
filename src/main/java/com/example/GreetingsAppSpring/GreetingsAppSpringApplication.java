package com.example.GreetingsAppSpring;

import com.example.GreetingsAppSpring.component.DemoBean;
import com.example.GreetingsAppSpring.component.EmployeeBean;
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

		logger.debug("*** Example Using @Autowired annotation on property ***");
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Manas Pratap Singh");
		employeeBean.showEmployeeDetails();
	}
}
