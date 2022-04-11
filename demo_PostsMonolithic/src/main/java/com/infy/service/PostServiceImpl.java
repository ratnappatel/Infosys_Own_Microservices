package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.entity.Post;
import com.infy.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {
	
	@Autowired PostRepository repository;
	public Post addPost(Post post)
	{
		return repository.save(post);
	}
	@Override
	public Post getPost(Integer id) {
		
		return repository.findById(id).get();
	}
}
