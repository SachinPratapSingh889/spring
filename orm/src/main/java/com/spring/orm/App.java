package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
					StudentDao studentDao= context.getBean("studentDao", StudentDao.class);
//					Student student = new Student(333,"Sachin","BSr");
//					Student student = new Student(222,"Akki","MJN");
//					Student student = new Student(111,"Som","ALLA");

//                 	int r=studentDao.insert(student);
//					System.out.println("done"+r);
//					Student student1=studentDao.getOneStudent(222);
//					System.out.println( student1.getName() + student1.getCity() + student1.getRollNo() );
//					studentDao.deleteRecord(222);

					
					
					
    }
}
