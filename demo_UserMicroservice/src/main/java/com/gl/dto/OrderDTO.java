package com.gl.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderDTO {
		
		private List<Order> order;
		private Map<Integer,List<OrderDetails>> details;
		public OrderDTO()
		{
			order=new ArrayList<>();
			details=new HashMap<>();
		}
	}
