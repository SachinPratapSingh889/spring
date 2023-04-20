package com.spring.componentAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/componentAnno/compoconfig.xml");
       Example ex= context.getBean("example", Example.class);
       System.out.println(ex+"............"+ ex.getName().getClass()); 
       System.out.println(ex.hashCode());
       Example ex2= context.getBean("example", Example.class);

       System.out.println(ex2.hashCode());
       
	}

}
