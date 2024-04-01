package com.docker.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 

@SpringBootApplication
@RestController
public class Application {


	@RequestMapping("/") 
   	 public String home() { 
        	return "Dockerizing Spring Boot Application"; 
    	}

	@RequestMapping("/login") 
   	 public String home() { 
        	return "<h1>This is where you will see the login page<h1>"; 
    	}

	@RequestMapping("/logout") 
   	 public String home() { 
        	return "<h1>This is where you will see the logout page<h1>"; 
    	}

	@RequestMapping("/home") 
   	 public String home() { 
        	return "<h1>This is where you should see the home page for the web app<h1>"; 
    	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
