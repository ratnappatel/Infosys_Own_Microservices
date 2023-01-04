package com.infy.dto;

import java.util.ArrayList;
import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDTO {
	private int id;
	private String title;
	private String description;
	List<CommentDTO> comments=new ArrayList<CommentDTO>();
}
