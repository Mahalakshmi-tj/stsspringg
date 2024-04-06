package com.springboot.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.h2.dao.EmployeeRepository;
import com.springboot.h2.model.Employee;

@RestController
public class EmployeeController
{
	@Autowired
  private EmployeeRepository repositry;
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee employee)
	{
		repositry.save(employee);
		return "Employee Saved....";
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAll()
	{
		return repositry.findAll();
	}
	
	@GetMapping("/getEmployee/{dept}")
	public List<Employee> getEmployeesByDepartment(@PathVariable String dept)
	{
	return repositry.findByDept(dept);
	}
	
}
