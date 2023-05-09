package com.learning.learnspringboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.learnspringboot.beans.Courses;

@RestController
public class CoursesController {
	// http://localhost:<port>/courses
	@GetMapping("/courses")
	public List<Courses> getAllCourses() {
		return Arrays.asList(new Courses(1, "Learn Springboot", "Tulsi Kant"), new Courses(2, "Learn JS", "Tulsi Kant"),
				new Courses(3, "Learn Microservices", "Tulsi Kant"));
	}

	// http://localhost:<port>/courses/1
	@GetMapping("/courses/1")
	public Courses getCourseDetails1() {
		return new Courses(1, "Learn Springboot", "Tulsi Kant");
	}
}
