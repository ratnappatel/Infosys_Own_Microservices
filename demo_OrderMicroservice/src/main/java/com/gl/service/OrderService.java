package com.gl.service;

import java.util.List;

import com.gl.entity.Order;
import com.gl.entity.OrderDetails;

public interface OrderService {
	
	public List<Order> getOrder(int userId);	
	public List<OrderDetails> getOrderDetails(int orderId);

}
