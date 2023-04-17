package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/collections/colconfig.xml");
		example exampleobj= (example) context.getBean("example");
		System.out.println(exampleobj);
	}

}
