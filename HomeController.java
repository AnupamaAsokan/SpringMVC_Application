package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller   // defines a controller class & supports component scanning
public class HomeController {

	@RequestMapping("/") // define request mapping
	public String showPage(){
		return "main-menu"; // name of the view page
	}
}
