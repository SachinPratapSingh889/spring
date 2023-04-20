package com.spring.standaloneCollec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/standaloneCollec/Standaloneconfig.xml");
		Collection col= (Collection) context.getBean("collection2");
//		System.out.println(col);
//		System.out.println(col.getClass().getName());
		System.out.println(col);
		System.out.println(col.getClass().getName());
		
	}

}
