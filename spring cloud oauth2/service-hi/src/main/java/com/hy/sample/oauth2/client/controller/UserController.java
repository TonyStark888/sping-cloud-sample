package com.hy.sample.oauth2.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hy.sample.oauth2.client.entity.User;
import com.hy.sample.oauth2.client.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServiceImpl userService;

	@RequestMapping(value = "/registry", method = RequestMethod.POST)
	public User createUser(@RequestParam("username") String username, @RequestParam("password") String password) {
		User u = new User(username, password);
		return userService.create(u);
	}

}