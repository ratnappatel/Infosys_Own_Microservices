package com.gl.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gl.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Integer>{

	public List<Order> findByUserid(int userId);
}
