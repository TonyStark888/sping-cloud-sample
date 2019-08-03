package com.hy.sample.oauth2.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.hy.sample.oauth2.client.dao.UserDao;
import com.hy.sample.oauth2.client.entity.User;

@Service
public class UserServiceImpl implements UserService {

	private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public User create(User user) {
		String hash = encoder.encode(user.getPassword());
		user.setPassword(hash);
		User u = userDao.save(user);
		return u;
	}

}
