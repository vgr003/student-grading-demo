package com.example.studentgradingdemo.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.studentgradingdemo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

  private List<Student> studentList = new ArrayList<>();

  @GetMapping("/students")
  public List<Student> allStudents() {
    return studentList;
  }

  @PostMapping("/student")
  public  Student add(@RequestBody  Student student) {
    studentList.add(student);
    return student;
  }
}
