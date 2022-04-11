package com.infy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.infy.entity.Comment;

public interface CommentRepository  extends CrudRepository<Comment, Integer>{
	public List<Comment> findByPostid(int post_id);
}
