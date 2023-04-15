package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entites.Student;

public interface StudentDao {
	
	public int insert(Student student);
	public int update(Student student);
	public int delete(Student student);
	public Student getstudent(int studentId);
	public List<Student> getallstudent();
	public void createtable();
	

}
