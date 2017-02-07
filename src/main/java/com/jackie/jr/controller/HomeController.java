package com.jackie.jr.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}

	@ResponseBody
	@RequestMapping(value="/test")
	public String test1(HttpServletResponse response) throws IOException{
		return "test  asdada gf qf wef";
	}


	@RequestMapping(method= RequestMethod.GET , value = "/test1/{name}")
	public @ResponseBody String sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
		return "aaa" + name;
	}
}
