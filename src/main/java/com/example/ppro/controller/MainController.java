package com.example.ppro.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.ppro.service.ZamestnanecService;

@Controller
public class MainController {

	@Autowired
	private ZamestnanecService zamestnanecService;
	
	@GetMapping(value = "/")
	public String init(HttpServletRequest req){
		req.setAttribute("zamestnanci", zamestnanecService.findAllZamestnanci());
		return "index";
	}
			
}
