package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.course;

public interface CourseService {
	
	public List<course> getCourses();
	public  course getCourse(long courseid);
	public course addCourse(course course);
    public void deleteCourse(long courseid);
    public course updateCourse(course courses);
}

