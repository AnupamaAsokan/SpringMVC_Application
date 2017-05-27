package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

// controller method to show the form
	@RequestMapping("/showForm")
	public String showForm(){
		System.out.println("Im in");
		return "helloworld-form";
	}	
	// controller method to process the form
	@RequestMapping("/processForm")
	public String processForm(){
		System.out.println("Hiii");
		return "helloworld";
	}	
	
	// new controller method to read form data
	@RequestMapping("/processForm2")
	public String letsShoutDude(HttpServletRequest request, Model model){
		String name = request.getParameter("studentName");
	//convert the name to Caps
		 name = name.toUpperCase();
	//create the name
		 String result = "Yo! " +name;
	//add message to the model	 
		 model.addAttribute("message", result);
		return "helloworld";
		
	}
	
	
	// new controller method to read form data using @RequestParam
		@RequestMapping("/processForm3")
		public String processForm(@RequestParam("studentName") String name, Model model){
		//convert the name to Caps
			 name = name.toUpperCase();
		//create the name
			 String result = "Yo Yo! " +name;
		//add message to the model	 
			 model.addAttribute("message", result);
			return "helloworld";
			
		}
		
	
	
}
