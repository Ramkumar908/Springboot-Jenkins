package com.ram.spring.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	 private static Logger log = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	@PostConstruct
	public void init()
	{
		log.info("Application Started at post Construct ....");
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
