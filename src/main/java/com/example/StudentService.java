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
}
