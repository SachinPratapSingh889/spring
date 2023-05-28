package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student details")
public class Student {
	@Column(name = "Student name")
	private String name;
	@Id
	@Column(name = "Student roll no")
	private int rollNo;
	@Column(name = "Student city")
	private String city;

	public Student(String name, int rollNo, String city) {
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
