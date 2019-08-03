package com.hy.sample.oauth2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hy.sample.oauth2.entity.User;

public interface UserDao extends JpaRepository<User, Long>{

	User findByUsername(String username);
}
