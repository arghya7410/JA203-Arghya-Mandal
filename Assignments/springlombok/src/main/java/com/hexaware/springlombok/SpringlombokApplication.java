package com.hexaware.springlombok;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hexaware.springlombok.entity.Student;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringlombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringlombokApplication.class, args);
		Student stu1 = new Student(1, "Arghya", "Java", LocalDate.now());
		Student stu2 = new Student(2, "Sahil", "C++", LocalDate.now());
		System.out.println("Information of student with id "+ stu1.getSid() + ": " + stu1.toString());
		System.out.println("Information of student with id "+ stu2.getSid() + ": " + stu2.toString());
		stu1.setCourse("Java Full Stack with Agular");
		log.info("Student with id: " + stu1.getSid() +" changed the course to: " + stu1.getCourse());
		log.info("New updated details for "+stu1.getSname()+": "+stu1.toString());
	}

}
