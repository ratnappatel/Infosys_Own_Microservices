package com.infy.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.entity.Post;
import com.infy.service.PostService;

@RestController
public class PostController {
	
	@Autowired PostService service;
	
	@PostMapping("/posts")
	public Post addPost(@RequestBody Post post)
	{
		return service.addPost(post);
	}
	
	
	@GetMapping("/posts/{id}")
	public Post getPost(@PathVariable Integer id)
	{
		return service.getPost(id);
	}

}
