package com.infy.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.entity.Comment;
import com.infy.service.CommentService;

@RestController
public class CommentController {
	
	@Autowired CommentService service;
	
	@GetMapping("/comments/{id}")
	public List<Comment> getComments(@PathVariable int id)
	{
		return service.getComments(id);
	}
	
	@PostMapping("/comments")
	public Comment addComment(@RequestBody Comment comment)
	{
		return service.addComment(comment);
	}

}
