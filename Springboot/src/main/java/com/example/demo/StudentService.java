package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class StudentService {


	List<Student> students = new ArrayList<>();

	public void createStudents() {
		students.add(new Student(1, "Aryan", 1, 97));
		students.add(new Student(2, "Akshay", 3, 98));
		students.add(new Student(3, "Sanjay", 4, 99));
		students.add(new Student(4, "Subbu", 5, 100));


	}
	public List<Student> getStudents(){
		createStudents();
		return students;
	}

	public Student getStudent(int id) {
		Student student=  students.stream().filter(s -> s.getId() == id ).findFirst().get();
		return student;
	}
	public void addStudent(Student student) {
		System.out.println("controllers add student");
		students.add(student);
	}
	public void updateStudent(Student student, int id) {
		for(int i = 0; i< students.size(); i++) {
			Student s = students.get(0);
			if(s.getId() == id) {
				students.set(id, student);
				return;
			}
		}
	}
}