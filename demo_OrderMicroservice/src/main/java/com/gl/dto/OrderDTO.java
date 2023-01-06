package com.gl.dto;

import java.util.List;
import java.util.Map;

import com.gl.entity.Order;
import com.gl.entity.OrderDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
	
	private List<Order> orders;
	private Map<Integer,List<OrderDetails>> details;

}
