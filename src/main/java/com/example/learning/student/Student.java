package com.example.learning.student;

import java.time.LocalDate;

public class Student {
  private int id;
  private String name;
  private int age;
  private LocalDate dob;
  private String email;

  public Student(int id, String name, int age, LocalDate dob, String email) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.dob = dob;
    this.email = email;
  }

  public int getId() {
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
