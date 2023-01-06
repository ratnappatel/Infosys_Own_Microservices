package com.gl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.entity.Product;
import com.gl.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts()
	{
		List<Product> prds=service.getAllProducts();
		return new ResponseEntity<>(prds,HttpStatus.OK);
	}

}
