package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
}