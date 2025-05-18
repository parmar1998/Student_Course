package com.m_to_m.rp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m_to_m.rp.entity.Course;
import com.m_to_m.rp.entity.Student;
import com.m_to_m.rp.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public Student save(Student student) {
		return studentRepository.save(student);
	}

	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	public Student findById(Long id) {
		return studentRepository.findById(id).orElse(null);
	}

	public void deleteById(Long id) {
		studentRepository.deleteById(id);
	}

	public Student addCourse(Long studentId, Course course) {
		Student student = findById(studentId);
		if (student != null) {
			student.addCourse(course);
			return save(student);
		}
		return null;
	}

	public Student removeCourse(Long studentId, Long courseId) {
		Student student = findById(studentId);
		if (student != null) {
			Course course = student.getCourses().stream().filter(c -> c.getId().equals(courseId)).findFirst()
					.orElse(null);
			if (course != null) {
				student.removeCourse(course);
				return save(student);
			}
		}
		return null;
	}
}