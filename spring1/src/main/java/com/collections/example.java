package com.collections;

import java.util.*;

public class example {
   private String name;
   private List<String> books;
   private Set<String> address;
   private Map<String, String> courses;
   public example(String name, List<String> books, Set<String> address, Map<String, String> courses) {
	super();
	this.name = name;
	this.books = books;
	this.address = address;
	this.courses = courses;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public example() {
	super();
	// TODO Auto-generated constructor stub
}
public List<String> getBooks() {
	return books;
}
public void setBooks(List<String> books) {
	this.books = books;
}
public Set<String> getAddress() {
	return address;
}
public void setAddress(Set<String> address) {
	this.address = address;
}
public Map<String, String> getCourses() {
	return courses;
}
public void setCourses(Map<String, String> courses) {
	this.courses = courses;
}
@Override
public String toString() {
	return "example [name=" + name + ", books=" + books + ", address=" + address + ", courses=" + courses + "]";
}

}
	