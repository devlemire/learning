package com.example.learning.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/student", produces = "application/json")
public class StudentController {

  private final StudentService studentService;

  @Autowired
  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping()
  public List<Student> getAllStudents(
    HttpServletRequest httpServletRequest
  ) {
    System.out.println("TENANT ---> " + httpServletRequest.getHeader("tenant"));
    return studentService.getAllStudents();
  }

  @PostMapping()
  public void createStudent(@RequestBody Student student) {
    studentService.createStudent(student);
  }

  @PutMapping()
  public Optional<Student> updateStudent(
    @RequestParam(value = "studentId") Long studentId,
    @RequestBody Student student
  ) {

    return studentService.updateStudent(studentId, student);
  }
}
