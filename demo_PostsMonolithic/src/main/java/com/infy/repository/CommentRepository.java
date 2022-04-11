package com.infy.repository;

import org.springframework.data.repository.CrudRepository;

import com.infy.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Integer> {

}
