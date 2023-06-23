package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;
	//to insert student in db
	
	
//	error->>>Operation of write not allowed on transaction to overcome we hav added this annot and most last bean in config.xml
	
	
	
//	1. Insert
	@Transactional
	public int insert(Student student) {
		//save method returns no of rows effected so we are taking it in integer and returning it
	Integer i = (Integer)this.hibernateTemplate.save(student);
		return i;
	}
	
	
//	2. getOneRecord
	public Student getOneStudent(int student_Id) {
		Student student=this.hibernateTemplate.get(Student.class,student_Id);
		return student;
	}
    
	
	
//	3. getAllRecord
	public List<Student> getAllStudent(){
		List<Student> students= this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
//	4. deleteRecord
	@Transactional
	public void deleteRecord(int rollno)
	{
		Student student= this.hibernateTemplate.get(Student.class, rollno);
		this.hibernateTemplate.delete(student);
	}
	
	
//	5.UpdateRecode
	@Transactional
	public void updateRecord(Student newstudent)
	{
		this.hibernateTemplate.update(newstudent);;
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
