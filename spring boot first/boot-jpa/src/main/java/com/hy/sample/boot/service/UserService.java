package com.hy.sample.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hy.sample.boot.dao.UserDao;
import com.hy.sample.boot.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao userRepository;
	
	public User findByusername(String username) {
		return userRepository.findByUsername(username);
	}
}
