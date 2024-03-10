package com.springwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@Autowired
	Student student;
	
	@RequestMapping("/home")
	public String getHome() {
		return "homecontroller.jsp";
	}

	@RequestMapping("/next")
	public String getNext() {
		return "index.jsp";
	}
}
