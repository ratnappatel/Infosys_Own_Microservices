package com.gl.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Order {
	
	
	private int id;
	private float orderAmount;
	
	private LocalDate orderDate;
	private int userid;

}
