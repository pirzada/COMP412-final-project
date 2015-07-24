package com.richa.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.richa.model.FinalResults;
import com.richa.model.ResultHelper;
 
@Controller
public class HelloWorldController{
 
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView handleRequestInternal() {
 
		ModelAndView model = new ModelAndView("form");
		//model.addObject("msg", "hello world");
 
		return model;
	}
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public ModelAndView handleSearchRequestInternal(@RequestParam Map<String, String> values ) {
		
		List<FinalResults> results = ResultHelper.search(values);
	
		ModelAndView model = new ModelAndView("result");
		model.addObject("result", results);
 
		return model;
	}
}