package com.example;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	private final StudentService serve;
	
	public StudentController(StudentService serve) {
		
		this.serve=serve;
	}
	
@PostMapping("/students")
public Student postStudent(@RequestBody Student student) {
	
	return serve.saveStudent(student);
}

@GetMapping("/allstudents")
public List<Student> getStudent(){
	
	
	return serve.getStudent();
}

@GetMapping("/FindId/{id}")
public Optional<Student> getById(@PathVariable Long id) {
	
	return serve.getById(id);
}

@DeleteMapping("/delete/{id}")
public void delete(@PathVariable Long id) {
	
	serve.deleteStudent(id);
}

@GetMapping("/course/{course}")
public List<Student> getByCourse(@PathVariable String course){
	
	return serve.findCourse(course);
}

@GetMapping("/coursename/{course}/{name}")
public List<Student> getByCourseName(@PathVariable String course,@PathVariable String name){
	
	
	return serve.getCourseName(name,course);
}

@GetMapping("/courseorname/{course}/{name}")
public List<Student> getByCourseOrName(@PathVariable String course,@PathVariable String name){
	
	         return serve.getCourseNameByOr(course,name);
}
}
