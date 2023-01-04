package com.gl.repository;

import org.springframework.data.repository.CrudRepository;

import com.gl.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
