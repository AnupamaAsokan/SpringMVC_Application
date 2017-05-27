package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel){
		System.out.println("Im inside student page");
		//create a student object
		Student theStudent = new Student();
		theModel.addAttribute("student", theStudent);
		return "student-form";		
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent){

		//log the input data
		System.out.println("FirstName " +theStudent.getFirstName());
		System.out.println("LastName " +theStudent.getLastName());
		return "student-confirmation";		
	}
	
	

}
