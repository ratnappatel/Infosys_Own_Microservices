package com.gl.controller;

import java.util.List;

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
		Order order=service.getOrder(userId);
		List<OrderDetails> details=service.getOrderDetails(order.getId());
		
		OrderDTO orderDTO=new OrderDTO(order,details);
		
		return new ResponseEntity<>(orderDTO,HttpStatus.OK);
		
	}
}
