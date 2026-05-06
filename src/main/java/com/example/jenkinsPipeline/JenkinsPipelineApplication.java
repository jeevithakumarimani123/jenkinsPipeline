package com.example.jenkinsPipeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsPipelineApplication {
	
	public static Logger logger = LoggerFactory.getLogger(JenkinsPipelineApplication.class);

	public static void main(String[] args) {
		
		logger.info("Jenking pipeline logger");
		SpringApplication.run(JenkinsPipelineApplication.class, args);
	}

}
