package com.gl.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetails implements Serializable{	
	
	private int id;
	private int orderId;
	private int productid;
	private int qty;

}
