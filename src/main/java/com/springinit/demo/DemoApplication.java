package com.springinit.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		// ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		// for (String name : applicationContext.getBeanDefinitionNames()) {
		// 	System.out.println(name);
		// }
	}

}
