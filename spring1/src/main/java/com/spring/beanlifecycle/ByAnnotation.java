package com.spring.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Postconstruct - for init method of bean
//@PreConstruct- for destroy method of bean

// To enable annotations we use  <context:annotation-config /> in xml file of configurations

//    Note that both @PostConstruct and @PreDestroy annotations are part of Java EE. And since Java EE has been
//deprecated in Java 9 and removed in Java 11]we have to add an additional dependency to use these
//annotations:

public class ByAnnotation {
   private int c;

public int getC() {
	return c;
}

public void setC(int c) {
	this.c = c;
}

public ByAnnotation(int c) {
	super();
	this.c = c;
}

public ByAnnotation() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "ByAnnotation [c=" + c + "]";
}

@PostConstruct   
public void start()
{	System.out.println("init method is running");
	
}

@PreDestroy
public void end() {
	System.out.println("Destroy method is running");
}
}
