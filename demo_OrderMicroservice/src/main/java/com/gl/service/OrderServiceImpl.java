package com.gl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.entity.Order;
import com.gl.entity.OrderDetails;
import com.gl.repository.OrderDetailsRepository;
import com.gl.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderRepository orderRepository;
	
	@Autowired 
	OrderDetailsRepository detailsRepository;
	
	@Override
	public List<Order> getOrder(int userId) {
		return orderRepository.findByUserid(userId);
	}
	@Override
	public List<OrderDetails> getOrderDetails(int orderId) {
		
		return detailsRepository.findByOrderId(orderId);
	}

}
