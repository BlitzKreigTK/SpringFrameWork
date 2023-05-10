package com.learning.learnspringboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.learnspringboot.beans.Courses;
import com.learning.learnspringboot.repository.CourseRepository;

@RestController
public class CoursesController {
	@Autowired
	private CourseRepository courseRepo;

	// GET = Used to retrieve data
	// http://localhost:<port>/courses
	@GetMapping("/courses")
	public List<Courses> getAllCourses() {
		return courseRepo.findAll();
//		return Arrays.asList(new Courses(1, "Learn Springboot", "Tulsi Kant"), new Courses(2, "Learn JS", "Tulsi Kant"),
//				new Courses(3, "Learn Microservices", "Tulsi Kant"));
	}

	// http://localhost:<port>/courses/1
	@GetMapping("/courses/{id}")
	public Courses getCourseDetails1(@PathVariable int id) {
		// Optional<EntityName> == Used as it can return id or may not
		Optional<Courses> course = courseRepo.findById(id);
		if (course.isEmpty()) {
			throw new RuntimeException("Course Id not found " + id);
		}
		return course.get();
		// return new Courses(1, "Learn Springboot", "Tulsi Kant");
	}

	// POST = Creates new resource
	@PostMapping("/addCourse")
	public void AddNewCourse(@RequestBody Courses course) {
		courseRepo.save(course);
	}

	// PUT = Updates or saves new resource
	@PutMapping("/updateCourse/{id}")
	public void UpdateCourse(@PathVariable int id, @RequestBody Courses course) {
		courseRepo.save(course);
	}

	// DELETE = Deletes resource
	@DeleteMapping("/delCourse/{id}")
	public void DeleteCourseById(@PathVariable int id) {
		courseRepo.deleteById(id);
	}
}
