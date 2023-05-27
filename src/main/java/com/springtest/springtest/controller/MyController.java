package com.springtest.springtest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.springtest.springtest.entities.Courses;
import com.springtest.springtest.services.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService cs;
	@GetMapping("/home")
	public String home() {
		return "Hello from Home";
	}
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		return this.cs.getCourses();
	}
	@GetMapping("/course/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
		return this.cs.getCourse(Long.parseLong(courseId));
	}
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses c) {
		return this.cs.addCourse(c);
	}
	@PutMapping("/courses")
	public Courses updateCourse(@RequestBody Courses c) {
		return this.cs.updateCourse(c);
	}
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> removeCourse(@PathVariable String courseId) {
		try {
			this.cs.removeCourse(courseId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
