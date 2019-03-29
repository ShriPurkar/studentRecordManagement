package com.bhagyashree.service;

import java.util.List;

import com.bhagyashree.model.Student;

public interface StudentService {
	public void add(Student student);
	public void edit(Student student);
	public void delete(int studentId);
	public com.bhagyashree.model.Student getStudent(int studentId);
	public List getAllStudent();
}
