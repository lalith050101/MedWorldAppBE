package com.example.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://localhost:8081")
//@CrossOrigin(origins = "https://8081-dbdedffdadadeeffdaabdfaccfeebafecbf.examlyiopb.examly.io")
@CrossOrigin(origins = {"https://medworld.daranip.com","https://medworld.netlify.app"})
@RestController
@RequestMapping("/")
public class HomeController {

	@GetMapping("/")
	public String testApi() {
		return "Api is working!!!";
	}
}
