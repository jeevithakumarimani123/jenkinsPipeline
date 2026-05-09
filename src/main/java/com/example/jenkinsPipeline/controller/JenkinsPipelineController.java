package com.example.jenkinsPipeline.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jenkinsPipeline.JenkinsPipelineApplication;

@RestController
@RequestMapping("/demoJen")
public class JenkinsPipelineController {

	public static Logger logger = LoggerFactory.getLogger(JenkinsPipelineController.class);

	@GetMapping("/getCtrl")
	public String getDemoController() {
		logger.info("Inside JenkinsPipelineController");
		return "This is a Jenkins controller";
	}
}