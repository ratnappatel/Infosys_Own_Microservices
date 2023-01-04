package com.infy.service;

import com.infy.dto.PostDTO;

public interface PostService {
	public PostDTO addPost(PostDTO post);
	
	public PostDTO getPost(Integer id);

}
