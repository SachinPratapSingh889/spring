package com.spring.componentAnno;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//Lecture 22 23 24
//@component annotaion is used when we dont want to use bean tag in config.xml file . spring will automatically understand 
//that he would have to a make object of this class
//@Component("example3")
@Component()
@Scope("prototype")
public class Example {
	@Value("Sachin")
    private String name;
	@Value("55")
    private int rollNo;
	@Value("#{courseID}")
	private List<String> courses;
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Example [name=" + name + ", rollNo=" + rollNo + " courses=" + courses + "]";
	}
	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Example(String name, int rollNo, List<String> courses) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.courses = courses;
	}
	
    
}
