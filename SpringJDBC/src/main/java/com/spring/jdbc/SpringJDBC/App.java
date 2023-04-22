package com.spring.jdbc.SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/SpringJDBC/config.xml");
    	
		JdbcTemplate template= context.getBean("jdbcTemp" , JdbcTemplate.class);
		String quary= "insert into student(id, name, city) values(? ,? ,?)";
		template.update(quary, 189 , "Akshay" , "MZN");
        System.out.println( "quary executed!" );
    }
}
