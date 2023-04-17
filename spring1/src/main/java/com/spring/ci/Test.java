package com.spring.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
     public static void main(String args[]) {
         ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ci/ciconfig.xml");
         Tutorial t= (Tutorial) context.getBean("tut1");
         System.out.println(t);
     }
}
