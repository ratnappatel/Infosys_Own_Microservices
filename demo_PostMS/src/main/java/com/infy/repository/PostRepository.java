package com.infy.repository;

import org.springframework.data.repository.CrudRepository;

import com.infy.entity.Post;

public interface PostRepository extends CrudRepository<Post, Integer>{

}
