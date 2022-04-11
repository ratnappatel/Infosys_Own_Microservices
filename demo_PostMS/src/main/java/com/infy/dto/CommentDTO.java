package com.infy.dto;

public class CommentDTO {
	
	private int id;
	private String text;
	private int postid;
	
	public CommentDTO() {
		// TODO Auto-generated constructor stub
	}

	public CommentDTO(int id, String text, int postid) {
		super();
		this.id = id;
		this.text = text;
		this.postid = postid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getPostid() {
		return postid;
	}

	public void setPostid(int postid) {
		this.postid = postid;
	}

	@Override
	public String toString() {
		return "CommentDTO [id=" + id + ", text=" + text + ", postid=" + postid + "]";
	}	
	

}
