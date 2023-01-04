package com.gl.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
	
	@Id
	private int id;
	private String name;
	private double salary;
	private int dept;

}
