package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentDao;
import com.example.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;

	@Override
	public void save(Student student) {
		studentDao.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}
	@Override
	@Transactional
    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

	@Override
	public void updateStudent(Student student) {
		System.out.println("coming to service");
		studentDao.updateStd(student);
		
	}
}
