package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ref/refconfig.xml");
		A a= (A)context.getBean("aBean");
		B b= (B)context.getBean("bBean");
		System.out.println(a.getY());

		System.out.println(b.getA().getY());
		System.out.println(b.getX());



		
     
	}

}
