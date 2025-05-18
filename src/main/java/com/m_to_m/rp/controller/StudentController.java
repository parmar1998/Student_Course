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
import com.m_to_m.rp.entity.Student;
import com.m_to_m.rp.service.StudentService;

@RestController
@RequestMapping("manytomany/students")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@PostMapping
	public Student createStudent(@RequestBody Student student) {
		return studentService.save(student);
	}

	@GetMapping
	public List<Student> getAllStudents() {
		return studentService.findAll();
	}

	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable Long id) {
		return studentService.findById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable Long id) {
		studentService.deleteById(id);
	}

	@PostMapping("/{studentId}/courses")
	public Student addCourse(@PathVariable Long studentId, @RequestBody Course course) {
		return studentService.addCourse(studentId, course);
	}

	@DeleteMapping("/{studentId}/courses/{courseId}")
	public Student removeCourse(@PathVariable Long studentId, @PathVariable Long courseId) {
		return studentService.removeCourse(studentId, courseId);
	}
}
