package com.lisz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class MyController {
	@GetMapping("/setSessionAttribute")
	public String setSessionAttribute(HttpServletRequest request){
		request.getSession().setAttribute("a", 1);
		return "Session attribute has been set";
	}
	@GetMapping("/getSessionAttribute")
	public String getSessionAttribute(HttpServletRequest request){
		return "Session attribute: " + request.getSession().getAttribute("a");
	}
}
