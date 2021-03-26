package com.example.learning.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
  private final StudentRepository studentRepository;

  @Autowired
  public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  public List<Student> getAllStudents() {
    return studentRepository.findAll();
  }

  public void createStudent(Student student) {
    studentRepository.save(student);
  }

  public Optional<Student> updateStudent(Long studentId, Student student) {
    Optional<Student> result = studentRepository.findById(studentId);

    if (result.isPresent()) {
      Student savedStudent = result.get();

      savedStudent.setEmail(student.getEmail());
      savedStudent.setDob(student.getDob());
      savedStudent.setName(student.getName());

      studentRepository.save(savedStudent);
    }

    return studentRepository.findById(studentId);
  }
}
