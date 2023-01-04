package com.gl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.entity.Employee;
import com.gl.service.EmployeeService;

@RestController

public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployee()
	{
		return new ResponseEntity<>(service.getAllEmployee(),HttpStatus.OK);
	}

}
