package com.infy.service;

import java.util.List;

import com.infy.dto.PostDTO;
import com.infy.entity.Post;

public interface PostService {
	
	public Post getPost(int id);
	public PostDTO addPost(PostDTO postDTO);
	public PostDTO updatePost(PostDTO postDTO);
	public String deletePost(int id);
	public List<Post> getAllPost();

}
