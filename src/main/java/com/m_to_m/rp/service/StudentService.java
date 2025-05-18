package com.m_to_m.rp.service;

import java.util.List;

import com.m_to_m.rp.entity.Course;
import com.m_to_m.rp.entity.Student;

public interface StudentService {
	public Student save(Student student);

	public List<Student> findAll();

	public Student findById(Long id);

	public void deleteById(Long id);

	public Student addCourse(Long studentId, Course course);

	public Student removeCourse(Long studentId, Long courseId);
}
