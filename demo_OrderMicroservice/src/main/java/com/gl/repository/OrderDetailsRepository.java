package com.gl.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gl.entity.OrderDetails;

public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Integer> {

	public List<OrderDetails> findByOrderId(int orderId);
}
