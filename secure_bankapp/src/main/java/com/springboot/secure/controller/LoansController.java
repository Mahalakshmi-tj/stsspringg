package com.springboot.secure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController 
{
	@GetMapping("/myLoans")
	public String getLoanDetails() 
	{
		return "details of loan from db";
	}
}
