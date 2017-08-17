package com.example.ppro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping(value = "/helloJsp")
	public String init(){
		return "index";
	}
	
}
