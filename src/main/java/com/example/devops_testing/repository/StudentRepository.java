package com.example.devops_testing.repository;

import com.example.devops_testing.model.StudentInformation;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.*;

@Service
public class StudentRepository {
  private static final Map<Integer, StudentInformation> studentInformationMap = new HashMap<>();
  static {
    for (int i = 1; i<10; i++){
      StudentInformation studentInformation = new StudentInformation();
      studentInformation.setId(i).setName("Student-"+i);
      studentInformationMap.put(i, studentInformation);
    }
  }

  public StudentInformation findById(int id){
    if (!studentInformationMap.containsKey(id))
      throw new RuntimeException("Student not found with id: "+id);
    return studentInformationMap.get(id);
  }

  public List<StudentInformation> findAll(){
    return new ArrayList<>(studentInformationMap.values());
  }

  public void save(StudentInformation studentInformation){
    if (studentInformationMap.containsKey(studentInformation.getId()))
      throw new RuntimeException("Student already exist with id: "+studentInformation.getId());

    studentInformationMap.put(studentInformation.getId(), studentInformation);
  }

  public void deleteById(int id){
    if (!studentInformationMap.containsKey(id))
      throw new RuntimeException("Student not found with id: "+id);

    studentInformationMap.remove(id);
  }
}
