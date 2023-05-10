package com.learning.learnspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.learnspringboot.beans.Courses;

public interface CourseRepository extends JpaRepository<Courses, Integer> { // Entity, Id type

}
