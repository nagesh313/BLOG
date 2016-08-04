package com.app.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Student;
import com.app.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	/*@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginPage() {
		System.out.println("login");
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		return model;
	}*/

	/*@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView homePage() {
		System.out.println("home");
		ModelAndView model = new ModelAndView();
		model.setViewName("home");
		return model;
	}*/
}
/*
 * @RequestMapping(value = "/home", method = RequestMethod.GET) public
 * ModelAndView homePage() {
 * 
 * ModelAndView model = new ModelAndView(); model.addObject("title",
 * "Spring Security Custom Login Form"); model.addObject("message",
 * "This is welcome page!"); model.setViewName("home"); return model;
 * 
 * }
 * 
 * @RequestMapping(value = "/welcome**", method = RequestMethod.GET) public
 * ModelAndView welcomePage() {
 * 
 * ModelAndView model = new ModelAndView(); model.addObject("title",
 * "Spring Security Custom Login Form"); model.addObject("message",
 * "This is welcome page!"); model.setViewName("home"); return model;
 * 
 * }
 * 
 * @RequestMapping(value = "/restricted", method = RequestMethod.GET) public
 * ModelAndView restricted() {
 * 
 * ModelAndView model = new ModelAndView(); model.addObject("title",
 * "Spring Security Custom Login Form"); model.addObject("message",
 * "This is welcome page!"); model.setViewName("restrictedPage"); return model;
 * 
 * }
 * 
 * //Spring Security see this :
 * 
 * @RequestMapping(value = "/login", method = RequestMethod.GET) public
 * ModelAndView login(
 * 
 * @RequestParam(value = "error", required = false) String error,
 * 
 * @RequestParam(value = "logout", required = false) String logout) {
 * System.out.println("login"); ModelAndView model = new ModelAndView(); if
 * (error != null) { model.addObject("error", "Invalid username and password!");
 * }
 * 
 * if (logout != null) { model.addObject("msg",
 * "You've been logged out successfully."); } model.setViewName("home");
 * 
 * return model;
 * 
 * }
 * 
 * @RequestMapping({"/index", "/"}) public String setupForm(Map<String, Object>
 * map){ System.out.println("index"); Student student = new Student();
 * map.put("student", student); map.put("studentList",
 * studentService.getAllStudent()); return "student"; }
 * 
 * @RequestMapping(value="/student.do", method=RequestMethod.POST) public String
 * doActions(@ModelAttribute Student student, BindingResult
 * result, @RequestParam String action, Map<String, Object> map){
 * System.out.println("student.do"); Student studentResult = new Student();
 * switch(action.toLowerCase()){ //only in Java7 you can put String in switch
 * case "add": studentService.add(student); studentResult = student; break; case
 * "edit": studentService.edit(student); studentResult = student; break; case
 * "delete": studentService.delete(student.getStudentId()); studentResult = new
 * Student(); break; case "search": Student searchedStudent =
 * studentService.getStudent(student.getStudentId()); studentResult =
 * searchedStudent!=null ? searchedStudent : new Student(); break; }
 * map.put("student", studentResult); map.put("studentList",
 * studentService.getAllStudent()); return "student"; } }
 */