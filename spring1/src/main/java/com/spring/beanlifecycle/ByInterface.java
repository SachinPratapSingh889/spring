package com.spring.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ByInterface implements InitializingBean , DisposableBean{
   private int a;

public ByInterface(int a) {
	super();
	this.a = a;
}

public ByInterface() {
	super();
	// TODO Auto-generated constructor stub
}

public int getA() {
	return a;
}

public void setA(int a) {
	System.out.println("setting variable");
	this.a = a;
}

@Override
public String toString() {
	return "ByInterface [a=" + a + "]";
}

public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("destroy method from interface");

}

public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("init method from interface");
}
   
}
