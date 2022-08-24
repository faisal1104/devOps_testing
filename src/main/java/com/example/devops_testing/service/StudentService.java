package com.example.devops_testing.service;

import com.example.devops_testing.model.StudentInformation;
import com.example.devops_testing.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
  private final StudentRepository studentRepository;

  public void addStudentInfo(StudentInformation studentInformation){
    studentRepository.save(studentInformation);
  }

  public StudentInformation getById(int id){
    return studentRepository.findById(id);
  }

  public List<StudentInformation> getAll(){
    return studentRepository.findAll();
  }
}
