package com.infy.service;

import com.infy.entity.Post;

public interface PostService {
	public Post addPost(Post post);
	
	public Post getPost(Integer id);

}
