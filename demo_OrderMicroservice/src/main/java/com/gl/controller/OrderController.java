package com.gl.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gl.dto.OrderDTO;
import com.gl.entity.Order;
import com.gl.entity.OrderDetails;
import com.gl.service.OrderService;

@RestController

public class OrderController {
	

	@Autowired
	OrderService service;	
	
	@GetMapping("/orders/{userId}")
	public ResponseEntity<OrderDTO> getOrderDetails(@PathVariable Integer userId)
	{
		
		List<Order> orders=service.getOrder(userId);
		Map<Integer,List<OrderDetails>> orderDetails=new HashMap<>();
		
		orders.forEach(o->{
			
			List<OrderDetails> details=service.getOrderDetails(o.getId());
			orderDetails.put(o.getId(), details);
		});		
		OrderDTO orderDTO=new OrderDTO(orders,orderDetails);
		System.out.println(orderDTO.getOrders());
		System.out.println(orderDTO.getDetails());
		
		return new ResponseEntity<>(orderDTO,HttpStatus.OK);
		
	}
}
