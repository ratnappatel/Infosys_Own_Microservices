package com.gl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.entity.Product;
import com.gl.repository.ProductRepository;

@Service
public class ProductServiceImpl  implements ProductService{

	@Autowired
	ProductRepository repository;
	@Override
	public List<Product> getAllProducts() {
		return (List<Product>) repository.findAll();
	}

}
