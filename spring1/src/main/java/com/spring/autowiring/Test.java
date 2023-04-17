package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
     public static void main(String args[]) {
         ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowiring/autoconfig.xml");
         AutowireWays t=  context.getBean("autowireExample" , AutowireWays.class);
         System.out.println(t);
     }
}
