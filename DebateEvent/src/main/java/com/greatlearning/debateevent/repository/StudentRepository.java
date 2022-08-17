package com.greatlearning.debateevent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.debateevent.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
