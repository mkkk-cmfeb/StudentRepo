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

@GetMapping("/contains/{name}")
public List<Student> getContainsName(@PathVariable String name){
	
	return serve.getNameContains(name);
}

@GetMapping("/startwith/{name}")
public List<Student> startWith(@PathVariable String name){
	
	return serve.getNameStart(name);
}

@GetMapping("/endwith/{name}")
public List<Student> getNameEndWith(@PathVariable String name){
	
	return serve.getNameEnd(name);
}

@GetMapping("/orderby/{course}")
public List<Student> getOrderBy(@PathVariable String course){
	
	return serve.getOrderByCourse(course);
}

@GetMapping("/orderbydesc/{courses}")
public List<Student> getOrderDesc(@PathVariable String courses)
{
	
	return serve.getOrderByDesc(courses);
}

@GetMapping("/orderbytop3/{course}")
public List<Student> getTop3(@PathVariable String course){
	
	return serve.getNameTop3(course);
}

@GetMapping("/countcourse/{course}")
public Long getCountCourse(@PathVariable String course) {
	
	return serve.getCountByCourse(course);
}

@GetMapping("/existcourse/{course}")
public Boolean  courseExistence(@PathVariable String course) {
	
	return  serve.courseExist(course);
}

@GetMapping("/coursenot/{course}")
public List<Student> getCourseNot(@PathVariable String course){
	
	return serve.notCourses(course);
}

}
