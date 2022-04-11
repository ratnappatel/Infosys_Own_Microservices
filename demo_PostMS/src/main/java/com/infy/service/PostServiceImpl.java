package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.entity.Post;
import com.infy.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService{

	@Autowired PostRepository repository;
	@Override
	public Post getPost(int id) {
	
		return repository.findById(id).get();
	}

}
