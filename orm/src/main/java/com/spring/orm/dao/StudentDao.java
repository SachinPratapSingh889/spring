package com.spring.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;
	//to insert student in db
	public int insert(Student student) {
		//save method returns no of rows effected so we are taking it in integer and returning it
	Integer i = (Integer)this.hibernateTemplate.save(student);
		return i;
	}
	
}
