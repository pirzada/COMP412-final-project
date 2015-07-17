package com.richa.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorldController{
 
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/search.html", method = RequestMethod.GET)
	public ModelAndView handleRequestInternal() {
 
		ModelAndView model = new ModelAndView("form");
		//model.addObject("msg", "hello world");
 
		return model;
	}
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/result.html", method = RequestMethod.POST)
	public ModelAndView handleSearchRequestInternal(@RequestParam Map<String, String> values ) {
 
		ModelAndView model = new ModelAndView("result");
		//model.addObject("msg", "hello world");
 
		return model;
	}
}