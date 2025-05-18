package com.m_to_m.rp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m_to_m.rp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
