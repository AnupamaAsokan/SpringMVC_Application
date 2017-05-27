package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.validation.CourseCode;

public class Customer {
	
	
	private String firstName;
	
// validation rules for LastName
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	
//validation rules for freePasses
	@Min(value=0,message="must be >=0")
	@Max(value=5,message="must be <=5")
	@NotNull(message="is required")
	private Integer freePasses;

//validation rules for courseCode
	@CourseCode(value="LUV", message="must start with LUV")
	@NotNull(message="is required")
	private String courseCode;
	
	@NotNull(message="is required")
	@Pattern(regexp ="[0-9]{5}",message="only 5 chars/digits")
	private String postalCode;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

}
