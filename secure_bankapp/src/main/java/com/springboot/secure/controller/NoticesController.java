package com.springboot.secure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController 
{
	@GetMapping("/notices")
	public String getNotices() 
	{
		return "here are some of the notices from bank";
	}
}
