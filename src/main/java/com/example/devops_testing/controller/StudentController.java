package com.example.devops_testing.controller;

import com.example.devops_testing.model.StudentInformation;
import com.example.devops_testing.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
  private final StudentService studentService;

  @GetMapping
  public List<StudentInformation> getAll(){
    return studentService.getAll();
  }

  @GetMapping("{id}")
  public StudentInformation getById(@PathVariable int id){
    return studentService.getById(id);
  }

  @PostMapping
  public void addStudentInfo(@RequestBody StudentInformation studentInformation){
    studentService.addStudentInfo(studentInformation);
  }

  @DeleteMapping("{id}")
  public void deleteById(@PathVariable int id){
    studentService.deleteById(id);
  }
}
