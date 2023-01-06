package com.gl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.gl.dto.OrderDTO;
import com.gl.dto.UserDTO;
import com.gl.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/users")
	public ResponseEntity<OrderDTO> findUser(@RequestBody UserDTO user)
	{
		int id=service.authenticateUser(user.getUsername(), user.getPassword());
		
		RestTemplate template=new RestTemplate();
		String url="http://localhost:8200/orders/{userId}";
		ResponseEntity<OrderDTO> orders= (ResponseEntity<OrderDTO>)template.getForObject(url, Object.class, id);
		
		return orders;
	}

}
