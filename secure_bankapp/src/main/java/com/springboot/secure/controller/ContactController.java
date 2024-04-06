package com.springboot.secure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController 
{
	@GetMapping("/contact")
	public String saveContactDetails() 
	{
		return "here is the contact details";
	}
}
