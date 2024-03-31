package com.springboot.datajpa.servicee;

import java.util.ArrayList;

import com.springboot.datajpa.model.Employee;

public interface EmpService {
	    ArrayList<Employee> findAllEmployee();
	    Employee findAllEmployeeByID(long id);
	    void addEmployee();
	    void deleteAllData();
	}

