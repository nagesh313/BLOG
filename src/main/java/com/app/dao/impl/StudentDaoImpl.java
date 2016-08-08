package com.app.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.dao.StudentDao;
import com.app.model.Student;

@Repository("studentDao")
public class StudentDaoImpl extends AbstractDao implements StudentDao {
	
	@Override
	public void add(Student student) {
		getSession().save(student);
	}

	@Override
	public void edit(Student student) {
		getSession().update(student);
	}

	@Override
	public void delete(int studentId) {		
		getSession().delete(getStudent(studentId));
	}

	@Override
	public Student getStudent(int studentId) {
		return (Student)getSession().get(Student.class, studentId);
	}

	@Override
	public List getAllStudent() {
		return getSession().createQuery("from Student").list();
	}

}
