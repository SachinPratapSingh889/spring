package com.spring.ambiguityinci;

public class First {
	private String name;
	private String city;
	
	
	//imp- in ci injection , if we have more than one consturctor than compiler wll try to find the one with para. String String and ll call it , if not
	//present than flow will go from upward to lowerdirection
	//type is useful to insert value that specific type
	//index is useful to change order 
	// by these two we can resolve the ambiguity
	private int a;
	private int b;
	@Override
	public String toString() {
		return "First [ a=" + a + ", b=" + b + " , name=" + name +" ,  city= " +city +"]";
	}
	public First(int a, int b) {
		super();
		System.out.println("we are inside int cons");
		this.a = a;
		this.b = b;
	}
	
	public First(double a,double b) {
		super();
		System.out.println("we are inside double cons");
		this.a = (int)a;
		this.b = (int)b;
	}
	
	public First(String name, String city ) {
		super();
		System.out.println("we are inside string cons");
		this.name= name;
		this.city= city;
	}
	public First() {
		super();
		// TODO Auto-generated constructor stub
	}

}
