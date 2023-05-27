package com.springtest.springtest.dau;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springtest.springtest.entities.Courses;

public interface CourseDau extends JpaRepository<Courses,Long>{
	
}
