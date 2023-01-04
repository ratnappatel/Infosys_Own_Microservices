package com.infy.service;

import java.util.List;

import com.infy.entity.Comment;

public interface CommentService {
	
	public List<Comment> getComments(int post_id);
	public Comment addComment(Comment comment);

}
