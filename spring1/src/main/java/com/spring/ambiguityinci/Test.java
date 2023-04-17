package com.spring.ambiguityinci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sachin pratap singh
 *
 */
public class Test {
     public static void main(String args[]) {
         ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ambiguityinci/ambciconfig.xml");
         First t= (First) context.getBean("tu2");
         System.out.println(t);
     }
}
