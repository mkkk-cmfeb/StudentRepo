package com.example;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private final StudentRepository stud;
	
	public StudentService(StudentRepository stud) {
		
		this.stud=stud;
	}
	
	public Student saveStudent(Student student) {
		
		return  stud.save(student);
		
	}
	
	public List<Student> getStudent(){
		
		return stud.findAll();
	}
	
	public Optional<Student> getById(Long id){
		
		return stud.findById( id);
	}
	
	public void deleteStudent(Long id) {
		
		stud.deleteById(id);
	}
	
	public List<Student> findCourse(String course){
		
		return stud.findByCourse(course);
	}
	
	public List<Student> getCourseName(String name,String course){
		
		return stud.findByNameAndCourse(name, course);
	}
	
	public List<Student> getCourseNameByOr(String course, String name){
		
		return stud.findByCourseOrName(course, name);
	}
	
	public List<Student> getNameContains(String name){
		
		
		return stud.findByNameContains(name);
	}
	
	public List<Student> getNameStart(String name){
		
		return stud.findByNameStartingWith(name);
	}
	
	public List<Student> getNameEnd(String name){
		
		
		return stud.findByNameEndingWith(name);
	}
	
	public List<Student> getOrderByCourse(String course){
		
		return stud.findByCourseOrderByNameAsc(course);
	}
	
	public List<Student> getOrderByDesc(String csc){
		
		return stud.findByCourseOrderByNameDesc(csc);
	}
	
	public List<Student> getNameTop3(String course){
		
		return stud.findTop3ByCourseOrderByNameAsc(course);
	}
	
	public Long getCountByCourse(String course) {
		
		return stud.countByCourse(course);
	}
	
	public Boolean courseExist(String course) {
		
		return stud.existsByCourse(course);
	}
	
	public List<Student> notCourses(String course){
		
		
		return stud.findByCourseNot(course);
	}
}
