package com.springboot.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController
{
	@RequestMapping("home")
	
  // public ModelAndView  home(@RequestParam("myName") String myName)
	public ModelAndView  home(Alien alien)
   {
	 ModelAndView mv= new ModelAndView();
	// mv.addObject("name",myName);
	   mv.addObject("obj",alien);
	   mv.setViewName("home");
	   
	   return mv;
   }
}
