package org.myself.demo.springboot.service;

import java.util.List;

import org.myself.demo.springboot.entry.Student;

public interface StudentService extends BaseService {
	
	public List<Student> list();
	
	public Student detail(Integer id);

}