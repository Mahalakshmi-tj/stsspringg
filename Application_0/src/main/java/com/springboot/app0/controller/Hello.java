package com.springboot.app0.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {

	@RequestMapping("hii")
	@ResponseBody
	public String m1()
	{
		return "hello this is web page";
	}
	
}
