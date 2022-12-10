package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
		@Value("${spring.application.user}")
		private String user;
		
		@GetMapping("/task")
		public String doTask() {
			return "Task Completed Successfully by : "+ user;
		}
}
