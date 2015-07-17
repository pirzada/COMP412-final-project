package com.richa.hellocontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorldController{
 
	@RequestMapping("/welcome")
	public ModelAndView handleRequestInternal() {
 
		ModelAndView model = new ModelAndView("form");
		//model.addObject("msg", "hello world");
 
		return model;
	}
}