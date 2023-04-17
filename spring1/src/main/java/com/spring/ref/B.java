package com.spring.ref;

public class B {
   private int x;
   private A a;
   
public B() {
	super();
	// TODO Auto-generated constructor stub
}
public B(int x, A a) {
	super();
	this.x = x;
	this.a = a;
}
public A getA() {
	return a;
}
public void setA(A a) {
	this.a = a;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
@Override
public String toString() {
	return "B [a=" + a + "]";
}
   
}
