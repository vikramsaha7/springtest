package com.springtest.springtest.services;

import java.util.List;

import com.springtest.springtest.entities.Courses;

public interface CourseService {
	public List<Courses> getCourses();
	public Courses getCourse(long courseId);
	public Courses addCourse(Courses c);
	public Courses updateCourse(Courses c);
	public void removeCourse(String courseId);
}
