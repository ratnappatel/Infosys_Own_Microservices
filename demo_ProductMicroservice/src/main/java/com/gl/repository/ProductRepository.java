package com.gl.repository;

import org.springframework.data.repository.CrudRepository;

import com.gl.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
