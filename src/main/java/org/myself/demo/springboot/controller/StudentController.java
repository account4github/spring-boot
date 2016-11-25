package org.myself.demo.springboot.controller;

import java.util.List;

import org.myself.demo.springboot.dto.RespInfo;
import org.myself.demo.springboot.entry.Student;
import org.myself.demo.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService service;

	@ApiOperation(value="获取学生列表", notes="")
	@RequestMapping(value="/", method=RequestMethod.GET)
	public RespInfo<List<Student>> list() {
		RespInfo<List<Student>> resp = new RespInfo<List<Student>>();
		
		resp.setData(service.list());
		
		return resp;
	}
	
	@ApiOperation(value="获取学生信息", notes="根据ID指定相关对象")
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public RespInfo<Student> detail(@PathVariable Integer id) {
		RespInfo<Student> resp = new RespInfo<Student>();
		
		resp.setData(service.detail(id));
		
		return resp;
	}
	
	@ApiOperation(value="新建学生信息", notes="根据ID指定相关对象")
	@RequestMapping(value="/", method=RequestMethod.POST)
	public RespInfo<Student> create(@RequestBody Student param) {
		RespInfo<Student> resp = new RespInfo<Student>();
		
		resp.setData(param);
		
		return resp;
	}
	
	@ApiOperation(value="修改学生信息", notes="根据ID指定相关对象")
	@RequestMapping(value="/", method=RequestMethod.PUT)
	public RespInfo<Student> update(@RequestBody Student param) {
		RespInfo<Student> resp = new RespInfo<Student>();
		
		resp.setData(param);
		
		return resp;
	}
	
	@ApiOperation(value="删除学生信息", notes="根据ID指定相关对象")
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public RespInfo<Student> delete(@PathVariable Integer id) {
		RespInfo<Student> resp = new RespInfo<Student>();
		
		resp.setData(service.detail(id));
		
		return resp;
	}
	
}