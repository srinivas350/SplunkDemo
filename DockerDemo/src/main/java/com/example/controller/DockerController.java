package com.example.controller;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	Logger logger=LogManager.getLogger(DockerController.class);
	
	@GetMapping("/greets")
	public String greet(@RequestParam("Greet") String greet)
	{
		logger.info("Greet method Execution Started");
		logger.info("Greet method Input "+greet);
		logger.info("Greet method Execution Ended");
		return greet;
	}

}
