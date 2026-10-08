package com.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {

	@Column(name="student_name")
	String name;
	
	@GeneratedValue
	@Id
	Long id;
	
	String course;
	
	
	public void setId(Long id) {
		
		this.id=id;
	}
	
	public String getName() {
		
		return name;
	}
	
	public String getCourse() {
		
		return course;
	}
	
}
