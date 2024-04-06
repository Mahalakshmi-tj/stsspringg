package com.springboot.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.practice.entity.People;
import com.springboot.practice.services.PeopleServices;

public class PeopleController {

	@Autowired
	private PeopleServices services;
	
	@PostMapping("/addpeople")
	public ResponseEntity<People> addPeople(@RequestBody People people)
	{
		return ResponseEntity.ok(this.services.createPeop(people));
	}
}