package com.infy.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.PostDTO;
import com.infy.entity.Post;
import com.infy.service.PostService;

@RestController
public class PostController {
	
	@Autowired PostService service;
	
	@PostMapping("/posts")
	public ResponseEntity<PostDTO> addPost(@RequestBody PostDTO postDTO)
	{
		return new ResponseEntity<>(service.addPost(postDTO),HttpStatus.OK);
	}
	
	
	@GetMapping("/posts/{id}")
	public ResponseEntity<PostDTO> getPost(@PathVariable Integer id)
	{
		return new ResponseEntity<>( service.getPost(id),HttpStatus.OK);
	}

}
