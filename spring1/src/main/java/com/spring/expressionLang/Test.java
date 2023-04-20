package com.spring.expressionLang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/expressionLang/expressionconfig.xml");
        Expression t = context.getBean("expression", Expression.class);
        System.out.println(t);
	}

}
