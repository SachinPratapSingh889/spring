package com.spring.expressionLang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//Lecture 25 26 27

@Component
public class Expression {
 @Value("#{5+5}")	
 private int a;
 
 //@Value("#{10/2}")
 @Value("#{5>6? 12: 11}")
 private int b;
  
 //getting boolean value in boolean type of variable
 @Value("#{3<6}")
 private boolean h;
 
 
 //calling a static method
 @Value("#{T(java.lang.Math).sqrt(25)}")
 private double sq;
 
 //calling a static value
 @Value("#{T(java.lang.Math).PI}")
 private double valueOfPi;
 
 
 //creating objects of Classes here we ll make object of String class and give a value 
 @Value("#{new java.lang.String('Sachin Pratap')}")
 private String name;
 
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getValueOfPi() {
	return valueOfPi;
}

public void setValueOfPi(double valueOfPi) {
	this.valueOfPi = valueOfPi;
}

public Expression(boolean h) {
	super();
	this.h = h;
}

public boolean isH() {
	return h;
}

public double getSq() {
	return sq;
}

public void setSq(double sq) {
	this.sq = sq;
}

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public int getB() {
	return b;
}

@Override
public String toString() {
	return "Expression [a=" + a + ", b=" + b + " , h=" + h + " ,sq= "+ sq +" , valueOfPi=" +valueOfPi+ " , name=" + name + "]";
}

public Expression() {
	super();
	// TODO Auto-generated constructor stub
}

public Expression(int a, int b ,boolean h , double sq) {
	super();
	this.a = a;
	this.b = b;
	this.h= h;
	this.sq= sq;
}

public void setB(int b) {
	this.b = b;
}
 
 
 
}
