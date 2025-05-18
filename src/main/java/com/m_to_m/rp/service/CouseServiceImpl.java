package com.m_to_m.rp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m_to_m.rp.entity.Course;
import com.m_to_m.rp.repository.CourseRepository;

@Service
public class CouseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository courseRepository;

	public Course save(Course course) {
		return courseRepository.save(course);
	}

	public List<Course> findAll() {
		return courseRepository.findAll();
	}

	public Course findById(Long id) {
		return courseRepository.findById(id).orElse(null);
	}

	public void deleteById(Long id) {
		courseRepository.deleteById(id);
	}
}
