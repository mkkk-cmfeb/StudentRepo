package com.example;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long>{
 
	public List<Student> findByCourse(String course);
	public List<Student> findByNameAndCourse(String name,String course);
	
	public List<Student> findByCourseOrName(String course,String name);
	
	public List<Student> findByNameContains(String name);
	
	public List<Student> findByNameStartingWith(String name);
	
	public List<Student> findByNameEndingWith(String name);
	
	public List<Student> findByCourseOrderByNameAsc(String course);
	
	public List<Student> findByCourseOrderByNameDesc(String scs);
	
	public List<Student> findTop3ByCourseOrderByNameAsc(String course);
	
	public Long countByCourse(String course);
	
	public Boolean existsByCourse(String course);
	
	public List<Student> findByCourseNot(String course);
	
	public List<Student> findByCourseDistinctByName(String course);
}
