package com.gl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.entity.Employee;
import com.gl.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository repo;
	@Override
	public List<Employee> getAllEmployee() {
		
		return (List<Employee>) repo.findAll();
	}

}
