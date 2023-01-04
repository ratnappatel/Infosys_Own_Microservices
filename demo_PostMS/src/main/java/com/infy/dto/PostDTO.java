package com.infy.dto;

import java.util.List;

public class PostDTO {
	
	private int id;
	private String title;
	private String description;
	private List<CommentDTO> comments;
		public PostDTO() {
			// TODO Auto-generated constructor stub
		}
		public PostDTO(int id, String title, String description, List<CommentDTO> comments) {
			super();
			this.id = id;
			this.title = title;
			this.description = description;
			this.comments = comments;
		}
		public PostDTO(int id, String title, String description) {
			super();
			this.id = id;
			this.title = title;
			this.description = description;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public List<CommentDTO> getComments() {
			return comments;
		}
		public void setComments(List<CommentDTO> comments) {
			this.comments = comments;
		}
		@Override
		public String toString() {
			return "PostDTO [id=" + id + ", title=" + title + ", description=" + description + ", comments=" + comments
					+ "]";
		}
		

}
