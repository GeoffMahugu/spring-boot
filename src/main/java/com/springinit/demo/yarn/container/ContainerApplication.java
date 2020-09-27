package com.springinit.demo.yarn.container;
import com.springinit.demo.DemoApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class ContainerApplication {

    public static void main(String[] args) {
        DemoApplication.run(ContainerApplication.class, args);
    }

    @Bean
    public HelloPojo helloPojo() {
        return new HelloPojo();
    }

}