package com.gl.repository;

import org.springframework.data.repository.CrudRepository;

import com.gl.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Integer>{

	public Order findByUserid(int userId);
}
