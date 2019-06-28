package com.hy.sample.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hy.sample.boot.entity.User;
import com.hy.sample.boot.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/user/{username}")
	public User getUser(@PathVariable("username") String username) {
		return service.findByusername(username);
	}
}
