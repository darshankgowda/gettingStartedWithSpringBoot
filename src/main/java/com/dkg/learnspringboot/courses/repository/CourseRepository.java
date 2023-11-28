package com.dkg.learnspringboot.courses.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dkg.learnspringboot.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{
 //Course is an entity and Long is Primary key
	//Long is a id(Primary key) Type
	//Spring Data JPA automatically generates a repository implementation for your CourseRepository interface at runtime, even without the need for you to annotate the interface with @Component.
}
