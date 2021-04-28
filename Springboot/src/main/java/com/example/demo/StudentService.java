package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentService {

    @RequestMapping("students")
    public List<Student> getStudents(){
       List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Aryan", 1, 97));
        students.add(new Student(2, "Akshay", 3, 98));
        students.add(new Student(3, "Sanjay", 4, 99));
        students.add(new Student(4, "Subbu", 5, 100));

        return students;
    }

}