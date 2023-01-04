package com.infy.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.CommentDTO;
import com.infy.dto.PostDTO;
import com.infy.entity.Comment;
import com.infy.entity.Post;
import com.infy.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {
	
	@Autowired PostRepository repository;
	public PostDTO addPost(PostDTO postDTO)
	{
		Post p=repository.save(this.getPostEntity(postDTO));
		return this.getPostDTO(p);
		
	}
	@Override
	public PostDTO getPost(Integer id) {
		
		Post p=repository.findById(id).get();
		return this.getPostDTO(p);
	}
	
	
	public Post getPostEntity(PostDTO postDTO)
	{
		Post post=new Post();
		post.setId(postDTO.getId());
		post.setTitle(postDTO.getTitle());
		post.setDescription(postDTO.getDescription());
		List<Comment> comments=postDTO.getComments().stream().map(dto->
			new Comment(dto.getId(),dto.getText())).collect(Collectors.toList());
		post.setComments(comments);
		return post;
	}
	
	public PostDTO getPostDTO(Post post)
	{
		PostDTO postDTO=new PostDTO();
		postDTO.setId(post.getId());
		postDTO.setTitle(post.getTitle());
		postDTO.setDescription(post.getDescription());
		List<CommentDTO> comments=post.getComments().stream().map(c->
			new CommentDTO(c.getId(),c.getText())).collect(Collectors.toList());
		postDTO.setComments(comments);
		return postDTO;
	}
	
}
