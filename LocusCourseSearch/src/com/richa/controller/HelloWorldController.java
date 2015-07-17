package com.richa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorldController{
 
	@RequestMapping("/search")
	public ModelAndView handleRequestInternal() {
 
		ModelAndView model = new ModelAndView("form");
		//model.addObject("msg", "hello world");
 
		return model;
	}
	
/*	@RequestMapping(value = "/result.html", method = RequestMethod.POST)
	public ModelAndView handleSearchRequestInternal() {
 
		ModelAndView model = new ModelAndView("form");
		//model.addObject("msg", "hello world");
 
		return model;
	}*/
}