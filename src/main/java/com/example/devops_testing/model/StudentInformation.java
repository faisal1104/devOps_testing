package com.example.devops_testing.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class StudentInformation {
  private int id;
  private String name;
}
