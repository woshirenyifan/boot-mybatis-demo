package com.ryf.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ryf.mapper.StudentMapper;
import com.ryf.model.Admin;
import com.ryf.model.Student;
import com.ryf.model.StudentExample;

@RestController
public class MyController {
	
	@Autowired
	private StudentMapper studentMapper;
	
	@RequestMapping("/test")
	public String test1(){
		
		return "Hello Spring Boot !";
	}
	
	/**
	 * 测试 fastjson
	 */
	@RequestMapping("/fastjson")
	public Admin testFastJson(){
		
		Admin admin = new Admin(1,"AlenTest",1.4,new Date());
		
		return admin;
	}
	
	/**
	 * 测试mybatis是否调通
	 */
	@RequestMapping("/mybatis1")
	public Student testMybatis(){
		
		Student student = studentMapper.selectByPrimaryKey("101");
		System.out.println(student);
		return student;
	}
	
	@RequestMapping("/mybatis2")
	public List<Student> testMybatis2(){
		List<Student> list = studentMapper.selectByExample(new StudentExample());
		return list;
	}
}
