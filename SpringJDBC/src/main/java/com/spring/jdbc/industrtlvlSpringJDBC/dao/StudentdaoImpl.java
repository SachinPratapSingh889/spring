package com.spring.jdbc.industrtlvlSpringJDBC.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.industrtlvlSpringJDBC.entities.Student;

public class StudentdaoImpl implements Studentdao{

	private JdbcTemplate jdbcTemplate;

	

	
	public StudentdaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}



	public StudentdaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public int insert(Student student) {
		String quary= "insert into student(id, name, city) values(? ,? ,?)";
        int result = jdbcTemplate.update(quary, student.getId(), student.getName(), student.getCity());
     	return result;
	}



	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}



	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	public int update(Student student) {
		// TODO Auto-generated method stub
		String quary= "update student set name=? , city=? where id=?";
		jdbcTemplate.update(quary, student.getName() , student.getCity() ,student.getId())	;
		return 0;
	}



	public int remove(int studentid) {
		String quary= "delete from student where id =?"; 
        jdbcTemplate.update(quary ,studentid);
		return 0;
	}



	public Student fatchOneRow(int studentid) {
       String quary= "select * from student where id=?";
      RowMapper<Student> rowmapper= new RowmapperImpl();
       Student student= jdbcTemplate.queryForObject(quary, rowmapper , 444);
		return student;
	}



	public List<Student> fatchAllRow() {
		  String quary= "select * from student";
	       RowMapper<Student> rowmapper= new RowmapperImpl();
	       List<Student> student= jdbcTemplate.query(quary, rowmapper);
		   return student;	
	}


}
