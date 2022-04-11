package com.infy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.entity.Comment;
import com.infy.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService{

	@Autowired CommentRepository repository;
	@Override
	public List<Comment> getComments(int post_id) {
		
		return repository.findByPostid(post_id);
	}

}
