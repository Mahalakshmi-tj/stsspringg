package com.springboot.datajpa.repositorry;


import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.datajpa.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
	    ArrayList<Employee> findAllEmployee();
	}

