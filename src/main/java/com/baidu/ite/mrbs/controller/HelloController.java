package com.baidu.ite.mrbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController{
	@RequestMapping("/")
	public String hello(Model model){
		return "/hello/index";
	}
}
