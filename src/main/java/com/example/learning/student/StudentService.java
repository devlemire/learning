package com.example.learning.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

  public List<Student> getAllStudents() {
    Student james = new Student(
        1,
        "James",
        23,
        LocalDate.of(1997, 3, 26),
        "a@gmail.com"
    );

    Student jessica = new Student(
        2,
        "Jessica",
        25,
        LocalDate.of(1998, 4, 27),
        "b@gmail.com"
    );

    return List.of(james, jessica);
  }
}
