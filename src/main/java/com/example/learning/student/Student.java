package com.example.learning.student;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Student {
  @Id
  @SequenceGenerator(
          name = "student_sequence",
          sequenceName = "student_sequence",
          allocationSize = 1
  )
  @GeneratedValue(
          strategy = GenerationType.SEQUENCE,
          generator = "student_sequence"
  )
  private Long id;

  private String name;
  private int age;
  private LocalDate dob;
  private String email;

  public Student(String name, int age, LocalDate dob, String email) {
    this.name = name;
    this.age = age;
    this.dob = dob;
    this.email = email;
  }

  public Student() {

  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "Student{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", age=" + age +
        ", dob=" + dob +
        ", email='" + email + '\'' +
        '}';
  }
}
