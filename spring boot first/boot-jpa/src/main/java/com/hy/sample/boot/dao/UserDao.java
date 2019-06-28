package com.hy.sample.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hy.sample.boot.entity.User;

public interface UserDao extends JpaRepository<User, Long>{

	User findByUsername(String username);
}
