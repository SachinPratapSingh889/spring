package com.spring.ci;

public class Tutorial {
 private int a;
 private int b;
 private int c;
public Tutorial(int a, int b, int c) {
	super();
	this.a = a;
	this.b = b;
	this.c=c;
}

public Tutorial() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Tutorial [a=" + a + ", b=" + b + " ,c=" +c +" ]";
}
 
}
