package com.example;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long>{
 
	public List<Student> findByCourse(String course);
	public List<Student> findByNameAndCourse(String name,String course);
	
	public List<Student> findByCourseOrName(String course,String name);
}
