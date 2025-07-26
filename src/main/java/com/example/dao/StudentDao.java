package com.example.dao;

import java.util.List;

import com.example.model.Student;

public interface StudentDao {
	void save(Student student);

	List<Student> getAllStudents();

	Student getStudentById(int id);

	void updateStd(Student student);
}

