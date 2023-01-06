package com.gl.dto;

import java.util.List;

import com.gl.entity.Order;
import com.gl.entity.OrderDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
	
	private Order order;
	private List<OrderDetails> details;

}
