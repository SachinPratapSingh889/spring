package com.spring.jdbc.industrtlvlSpringJDBC.dao;
import java.util.List;

import com.spring.jdbc.industrtlvlSpringJDBC.entities.Student;

public interface Studentdao {
   public int insert(Student student);
   public int update(Student student);
   public int remove(int studentid);
   public Student fatchOneRow(int studentid);
   public List<Student> fatchAllRow();
   
}
