package com.hy.sample.admin.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class HiController {

	@Value("${server.port}")
	private int port;
	
	@GetMapping("/hello")
	@HystrixCommand(fallbackMethod = "helloError")
	public String hello(@RequestParam String name) {
		return String.format("Hello %s , I'm client from port: %s", name,port);
	}
	
	public String helloError(String name) {
		return String.format("Hello %s , I'm sorry", name);
	}
}
