package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		Car car1 = context.getBean(Car.class);
		
		System.out.println(car1.getName());
		System.out.println(car1.getColor());
		System.out.println(car1.getEngine().getEngine());
		System.out.println(car1.getEngine().getCc());
	}

}
