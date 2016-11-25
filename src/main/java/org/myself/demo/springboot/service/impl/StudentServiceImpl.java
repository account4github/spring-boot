package org.myself.demo.springboot.service.impl;

import java.util.List;

import org.myself.demo.springboot.dao.StudentDao;
import org.myself.demo.springboot.entry.Student;
import org.myself.demo.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao dao;

	@Override
	public List<Student> list() {
		return dao.findAll();
	}

	@Override
	public Student detail(Integer id) {
		return dao.findById(id);
	}

}