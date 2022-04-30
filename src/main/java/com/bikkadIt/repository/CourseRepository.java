package com.bikkadIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadIt.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
