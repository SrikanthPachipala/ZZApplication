package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Student student) {
		sessionFactory.getCurrentSession().saveOrUpdate(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return sessionFactory.getCurrentSession().createQuery("from Student", Student.class).list();
	}
	@Override
	public Student getStudentById(int id) {
         Session session = sessionFactory.getCurrentSession();
        return session.get(Student.class, id);
    }

	@Override
	public void updateStd(Student student) {
		System.out.println("dao updated"+student.getName());
		Session session = sessionFactory.getCurrentSession();
	    session.update(student);
		
	}
}
