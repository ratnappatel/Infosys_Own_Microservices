package com.gl.repository;

import org.springframework.data.repository.CrudRepository;

import com.gl.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

	public User findByUsernameAndPassword(String username,String password);
}
