package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")
public class Student {
	
	@Id
	@Column(name = "Student_roll_no")
	private int rollNo;
	@Column(name = "Student_name")
	private String name;
	@Column(name = "Student_city")
	private String city;

	public Student( int rollNo,String name, String city) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.city = city;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
