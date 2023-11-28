package com.dkg.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //is a combination of below annotations

//@SpringBootConfiguration
//@EnableAutoConfiguration  //by default it was added even if you are not specified
//@ComponentScan //by default it was added even if you are not specified
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);
	}
}
