package com.infy.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.infy.dto.CommentDTO;
import com.infy.dto.PostDTO;
import com.infy.entity.Post;
import com.infy.service.PostService;

@RestController
public class PostController {
	
	@Autowired PostService service;
	@GetMapping("/posts/{id}")
	public PostDTO getPost(@PathVariable Integer id)
	{
		Post post=service.getPost(id);
		
		PostDTO postDTO=new PostDTO();
		postDTO.setId(post.getId());
		postDTO.setTitle(post.getTitle());
		postDTO.setDescription(post.getDescription());
		
		// A class allow developer to call any REST API url within Java class
		RestTemplate template=new RestTemplate();
		
		List<CommentDTO> comments=(List<CommentDTO>) template.getForObject("http://localhost:8100/comments/"+post.getId(), Object.class);
		
		postDTO.setComments(comments);
		
		return postDTO;
	}
	
	@PostMapping("/posts")
	public ResponseEntity<PostDTO> addNewPost(@RequestBody PostDTO postDTO)
	{
		service.addPost(postDTO);
		RestTemplate template=new RestTemplate();
		CommentDTO comments=template.postForEntity("http://localhost:8100/comments", postDTO.getComments(), CommentDTO.class).getBody();
		
		return new ResponseEntity<>();
	}
	

}
