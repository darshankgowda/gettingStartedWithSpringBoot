package com.dkg.learnspringboot.courses.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity   //creates the table based on our entities
public class Course {
	
	@Id
	@GeneratedValue
	private long id;   //making id as a unique primary key
	@Column(name="Course_Name")  //we can customize our column names
	private String name;
	private String author;
	public Course() {
		
	}
	public Course(long id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

	
}

//netstat -ano | findstr :8080
//taskkill /F /PID 2560

