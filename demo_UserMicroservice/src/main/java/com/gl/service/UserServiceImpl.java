package com.gl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.entity.User;
import com.gl.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository repository;
	
	@Override
	public int authenticateUser(String username, String password) {
	
		User user=repository.findByUsernameAndPassword(username, password);
		return user.getId();
	}

}
