package com.springrest.springrest.controller;

import java.security.PublicKey;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.PutExchange;

import com.springrest.springrest.entities.course;
import com.springrest.springrest.services.CourseService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class MyController {
	@Autowired
	private CourseService CourseSerivice;
	@GetMapping("/home")
	public String home()
	{
		return "this is fun";
	}
	@GetMapping("/courses")
	public List<course> getCourses()
	{
		return this.CourseSerivice.getCourses();
	}
	@GetMapping("/courses/{courseid}")
	public course getCourse(@PathVariable String courseid)
	{
		return this.CourseSerivice.getCourse(Long.parseLong(courseid));
	}
	@PostMapping ("/courses")
	public course addCourse( @RequestBody course  course) {
		 return this.CourseSerivice.addCourse(course);
	}
		 
	@DeleteMapping("/courses/{courseid}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseid)
	{try {
		 this.CourseSerivice.deleteCourse(Long.parseLong(courseid));
		 return new ResponseEntity<>(HttpStatus.OK);
	}catch(Exception e) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	@PutMapping("/courses")
	public course updateCourse( @RequestBody course courses) {
		return this.CourseSerivice.updateCourse(courses);
	}
}