package com.springboot.secure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController
{

	@GetMapping("/myCards")
	public String getCardDetails()
	{
		return "details of card from db";
	}
}
