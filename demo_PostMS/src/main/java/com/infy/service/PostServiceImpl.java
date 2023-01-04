package com.infy.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.PostDTO;
import com.infy.entity.Post;
import com.infy.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService{

	@Autowired PostRepository repository;
	@Override
	public Post getPost(int id) {
	
		return repository.findById(id).get();
	}
	@Override
	public PostDTO addPost(PostDTO postDTO) {
		Post post=repository.save(this.getPostEntity(postDTO));
		return this.getPostDTO(post);
	}
	@Override
	public PostDTO updatePost(PostDTO postDTO) {
		Post p=repository.findById(postDTO.getId()).get();
		p.setDescription(postDTO.getDescription());
		p.setTitle(postDTO.getTitle());
		repository.save(p);
		return this.getPostDTO(p);
	}
	@Override
	public String deletePost(int id) {
		Post p=repository.findById(id).get();
		repository.delete(p);
		return "Done";
	}
	@Override
	public List<Post> getAllPost() {
		List<Post> lists=(List<Post>) repository.findAll();
		
		
		return lists;
	}
	
	public Post getPostEntity(PostDTO postDTO)
	{
		Post post=new Post();
		post.setId(postDTO.getId());
		post.setDescription(postDTO.getDescription());
		post.setTitle(postDTO.getTitle());
		
		return post;
	}
	
	
	public PostDTO getPostDTO(Post post)
	{
		PostDTO postDTO=new PostDTO();
		postDTO.setId(post.getId());
		postDTO.setDescription(post.getDescription());
		postDTO.setTitle(post.getTitle());
		
		return postDTO;
	}
	

}
