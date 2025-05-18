package com.m_to_m.rp.service;

import java.util.List;

import com.m_to_m.rp.entity.Course;

public interface CourseService {
	public Course save(Course course);

	public List<Course> findAll();

	public Course findById(Long id);

	public void deleteById(Long id);
}
