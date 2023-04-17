package com.spring.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
     public static void main(String args[]) {
         AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/beanlifecycle/Lifycycleconfig.xml");
        // ThreeWaysOfCycles t=  context.getBean("tut6" , ThreeWaysOfCycles.class);
         //System.out.println(t);
         context.registerShutdownHook();
//         System.out.println("++++++++++++++++++++++++++++");
//         ByInterface i = context.getBean("tut7", ByInterface.class);
//         System.out.println(i);
         System.out.println("++++++++++++++++++++++++++++");
       ByAnnotation j = context.getBean("tut8", ByAnnotation.class);
       System.out.println(j);
         
     }
}
