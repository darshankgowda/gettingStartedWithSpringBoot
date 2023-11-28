package com.dkg.learnspringboot.courses.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.dkg.learnspringboot.courses.repository.CourseRepository;
import com.dkg.learnspringboot.courses.bean.Course;

@RestController
public class CourseController {
	@Autowired
	private CourseRepository repository;
	
	@GetMapping("/courses")
	public List<Course> getAllCourse() {
		return repository.findAll();
		//return Arrays.asList(new Course(1, "Learn MicroServices", "in28minutes"));
	}
	@GetMapping("/courses/{id}")
	public Course getAllDetails(@PathVariable long id) {   //mapping of id variable in course.java
		Optional<Course> course = repository.findById(id);
		if(course.isEmpty()) {
			throw new RuntimeException("Course not find with id "+id);
		}
		return course.get();
	}
	//POST - create a new resource (/courses)
	@PostMapping("/courses")  //requesting to POST
	public void createCourse(@RequestBody Course course) {  //pick a body of request and maps to Course entity
		repository.save(course);
	}
	@PutMapping("/courses/{id}")  //when you are updating you know what your updating so use {id}
	public void updateCourse(@PathVariable long id, @RequestBody Course course) {  //pick a body of request and maps to Course entity
		repository.save(course);
	}
	@DeleteMapping("/courses/{id}")  //when you are updating you know what your updating so use {id}
	public void deleteCourse(@PathVariable long id) {  //pick a body of request and maps to Course entity
		repository.deleteById(id);
	}
}
