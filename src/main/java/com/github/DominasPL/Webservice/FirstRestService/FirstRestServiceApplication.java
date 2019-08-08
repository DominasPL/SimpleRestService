package com.github.DominasPL.Webservice.FirstRestService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication to jest to samo co 3 adnotacje na dole
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class FirstRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstRestServiceApplication.class, args);
	}

}
