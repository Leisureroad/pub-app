package com.example.PubSvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PubSvcApplication {

	@RequestMapping("/")
	public String hello() {
	  return "Hello From Pub App V2!";
	}

	public static void main(String[] args) {
		SpringApplication.run(PubSvcApplication.class, args);
	}
}
