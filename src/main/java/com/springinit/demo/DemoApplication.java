package com.springinit.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class DemoApplication {

	@RequestMapping("/")
    String home() {
        return "Hello World!";
    }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}
