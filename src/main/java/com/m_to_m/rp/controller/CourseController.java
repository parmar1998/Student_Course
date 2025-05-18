package com.m_to_m.rp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m_to_m.rp.entity.Course;
import com.m_to_m.rp.service.CourseService;

@RestController
@RequestMapping("manytomany/courses")
public class CourseController {
	@Autowired
	private CourseService courseService;

	@PostMapping
	public Course createCourse(@RequestBody Course course) {
		return courseService.save(course);
	}

	@GetMapping
	public List<Course> getAllCourses() {
		return courseService.findAll();
	}

	@GetMapping("/{id}")
	public Course getCourseById(@PathVariable Long id) {
		return courseService.findById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteCourse(@PathVariable Long id) {
		courseService.deleteById(id);
	}
}