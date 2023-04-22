package com.spring.jdbc.industrtlvlSpringJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.industrtlvlSpringJDBC.dao.Studentdao;
import com.spring.jdbc.industrtlvlSpringJDBC.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/industrtlvlSpringJDBC/industrylvlconfig.xml");
    	
    	Studentdao stdao= context.getBean("studentdaoImpl" , Studentdao.class);
    	
//        Student student = new Student();
//    	student.setId(980);
//    	student.setName("Somesh");
//    	student.setCity("Praygraj");
////    	
//    	int result = stdao.insert(student);
//        System.out.println( result );
        
   //    Student student2 = new Student();
    //     student2.setId(989);
    // 	student2.setName("Dheeraj");
   // 	student2.setCity("Noida");
//     	int result2=stdao.update(student2);
//        System.out.println( result2);
    	
     
//      	int result3=stdao.remove(189);
//         System.out.println( result3);

    	Student student= stdao.fatchOneRow(444);
    	List<Student> student1 =stdao.fatchAllRow();
    	for(Student s: student1)
    	{
            System.out.println( s);

    	}
    	
         //System.out.println( student );
    }
}
