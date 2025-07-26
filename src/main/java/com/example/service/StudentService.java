package com.example.service;

import java.util.List;

import com.example.model.Student;

public interface StudentService {
	void save(Student student);

	List<Student> getAllStudents();

	Student getStudentById(int id);

	void updateStudent(Student student);
}
